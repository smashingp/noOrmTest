package es.alop.noorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.alop.noorm.data.entities.TipoGarantia;
import es.alop.noorm.data.entities.VersaoMensagem;
import es.alop.noorm.data.repositories.TipoGarantiaRepository;
import es.alop.noorm.data.repositories.VersaoMensagemRepository;

@Service
public class TipoGarantiaService {

	@Autowired
	TipoGarantiaRepository repo;
	
	@Autowired
	VersaoMensagemRepository vmRepo;
	
	public List<TipoGarantia> getByActiveVersion() {
		
		VersaoMensagem ativo = vmRepo.getActiveVersion();
		
		TipoGarantia tg = new TipoGarantia();
		tg.setDat_rfrc_vers(ativo.getDat_rfrc_vers());
		tg.setNum_vers_prdo_rfrc(ativo.getNum_vers_prdo_rfrc());
		
		return repo.findByPK(tg);
	}
	
}
