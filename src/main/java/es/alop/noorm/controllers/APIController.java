package es.alop.noorm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import es.alop.noorm.data.dto.DataDTO;
import es.alop.noorm.services.TipoGarantiaService;
import es.alop.noorm.services.VersaoMensagemService;

@RestController
public class APIController {

	@Autowired
	TipoGarantiaService serviceTG;
	
	@Autowired
	VersaoMensagemService serviceVM;
	
	@GetMapping("/")
	public ResponseEntity<DataDTO> index() {
		
		DataDTO dto = new DataDTO();
		dto.setVersao(serviceVM.getActive());
		dto.setTipoGarantia(serviceTG.getByActiveVersion());
		
		return ResponseEntity.ok(dto);
	}
	
}
