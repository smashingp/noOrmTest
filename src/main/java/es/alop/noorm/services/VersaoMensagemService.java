package es.alop.noorm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.alop.noorm.data.entities.VersaoMensagem;
import es.alop.noorm.data.repositories.VersaoMensagemRepository;

@Service
public class VersaoMensagemService {
	
	@Autowired
	VersaoMensagemRepository repo;
	
	public VersaoMensagem getActive() {
		return repo.getActiveVersion();
	}

}
