package es.alop.noorm.data.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import es.alop.noorm.data.entities.TipoGarantia;
import es.alop.noorm.exceptions.DatabaseException;

@Repository
public class TipoGarantiaRepository implements es.alop.noorm.data.Repository<TipoGarantia> {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(TipoGarantia entity) throws DatabaseException {
		try {
			jdbcTemplate.update("insert into tipo_gara(dat_rfrc_vers, num_vers_prdo_rfrc, cod_tipo_gara, nom_tipo_gara) values(?,?,?,?)", entity.getDat_rfrc_vers(), entity.getNum_vers_prdo_rfrc(), entity.getCod_tipo_gara(), entity.getNom_tipo_gara());
		} catch(Exception ex) {
			throw new DatabaseException("Erro na inclusão: " + ex.getMessage());
		}
	}

	@Override
	public void delete(TipoGarantia entity) {
		// TODO Auto-generated method stub
	}

	@Override
	public Long update(TipoGarantia entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoGarantia> findByPK(TipoGarantia entity) {
		return jdbcTemplate.query("select * from tipo_gara where dat_rfrc_vers = ? and num_vers_prdo_rfrc = ?", new Object[] { entity.getDat_rfrc_vers(), entity.getNum_vers_prdo_rfrc() }, new TipoGarantiaRowMapper());
	}
	

	class TipoGarantiaRowMapper implements RowMapper<TipoGarantia> {

		@Override
		public TipoGarantia mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			TipoGarantia tg = new TipoGarantia();
			tg.setCod_tipo_gara(rs.getLong("cod_tipo_gara"));
			tg.setDat_rfrc_vers(rs.getDate("dat_rfrc_vers"));
			tg.setNom_tipo_gara(rs.getString("nom_tipo_gara"));
			tg.setNum_vers_prdo_rfrc(rs.getLong("num_vers_prdo_rfrc"));
			
			return tg;
		}
		
	}

}
