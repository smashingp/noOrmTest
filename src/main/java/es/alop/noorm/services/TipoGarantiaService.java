package es.alop.noorm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.alop.noorm.data.repositories.TipoGarantiaRepository;
import es.alop.noorm.entities.TipoGarantia;
import es.alop.noorm.entities.VersaoMensagem;

@Service
public class TipoGarantiaService {

	@Autowired
	TipoGarantiaRepository repo;
	
	public List<TipoGarantia> getByActiveVersion(VersaoMensagem msgActive) {
		
		
		
		return null;
	}
	
}
