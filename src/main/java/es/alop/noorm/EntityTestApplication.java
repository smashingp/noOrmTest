package es.alop.noorm;

import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.alop.noorm.data.repositories.TipoGarantiaRepository;
import es.alop.noorm.data.repositories.VersaoMensagemRepository;
import es.alop.noorm.entities.TipoGarantia;
import es.alop.noorm.entities.VersaoMensagem;

@SpringBootApplication
public class EntityTestApplication /*implements CommandLineRunner*/ {

	org.slf4j.Logger logger = LoggerFactory.getLogger(EntityTestApplication.class);
	
	@Autowired
	VersaoMensagemRepository vmRepo;
	
	@Autowired
	TipoGarantiaRepository tgRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EntityTestApplication.class, args);
	}

	// @Override
	public void run(String... args) throws Exception {

		logger.info("inicio do insert");
		
		VersaoMensagem obj1 = new VersaoMensagem();
		Date d1 = new Date();
		Date d2 = new Date();
		obj1.setDat_rfrc_vers(d1);
		obj1.setNum_vers_prdo_rfrc(1L);
		obj1.setDat_hor_carg_vers(d2);
		obj1.setInd_vers_ativ("1");
		
		TipoGarantia obj2 = new TipoGarantia();
		obj2.setDat_rfrc_vers(d1);
		obj2.setNum_vers_prdo_rfrc(1L);
		obj2.setCod_tipo_gara(23L);
		obj2.setNom_tipo_gara("Imóvel");
		
		vmRepo.insert(obj1);
		tgRepo.insert(obj2);
		
		logger.info("fim do insert");
		
	}

}
