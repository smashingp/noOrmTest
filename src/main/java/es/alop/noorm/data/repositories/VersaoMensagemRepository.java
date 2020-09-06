package es.alop.noorm.data.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import es.alop.noorm.data.repositories.TipoGarantiaRepository.TipoGarantiaRowMapper;
import es.alop.noorm.entities.TipoGarantia;
import es.alop.noorm.entities.VersaoMensagem;
import es.alop.noorm.exceptions.DatabaseException;
import es.alop.noorm.utils.Tools;

@Repository
@Component
public class VersaoMensagemRepository implements es.alop.noorm.data.Repository<VersaoMensagem> {

	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(VersaoMensagem entity) throws DatabaseException {
		try {
			jdbcTemplate.update("insert into vers_info_mens(dat_rfrc_vers, num_vers_prdo_rfrc, dat_hor_carg_vers, ind_vers_ativ) values(?,?,?,?)", Tools.dateToMysqlString(entity.getDat_rfrc_vers()), entity.getNum_vers_prdo_rfrc(), Tools.dateToMysqlString(entity.getDat_hor_carg_vers()), entity.getInd_vers_ativ());
		} catch(Exception ex) {
			throw new DatabaseException("Erro na inclusão: " + ex.getMessage());
		}
	}
	
	public VersaoMensagem getActiveVersion() {
		return jdbcTemplate.queryForObject("select * from vers_info_mens where ind_vers_ativ = '1'", new VersaoMensagemRowMapper());
	}
	
	@Override
	public void delete(VersaoMensagem entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public Long update(VersaoMensagem entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VersaoMensagem> findByPK(VersaoMensagem entity) {
		return jdbcTemplate.query("select * from vers_info_mens where dat_rfrc_vers = ? and num_vers_prdo_rfrc = ?", new Object[] { entity.getDat_rfrc_vers(), entity.getNum_vers_prdo_rfrc() }, new VersaoMensagemRowMapper());
	}
	
	class VersaoMensagemRowMapper implements RowMapper<VersaoMensagem> {

		@Override
		public VersaoMensagem mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			VersaoMensagem vm = new VersaoMensagem();
			vm.setInd_vers_ativ(rs.getString("ind_vers_ativ"));
			vm.setDat_rfrc_vers(rs.getDate("dat_rfrc_vers"));
			vm.setDat_hor_carg_vers(rs.getDate("dat_hor_carg_vers"));
			vm.setNum_vers_prdo_rfrc(rs.getLong("num_vers_prdo_rfrc"));
			
			return vm;
		}
		
	}

}
