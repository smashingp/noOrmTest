package es.alop.noorm.data.dto;

import java.util.List;

import es.alop.noorm.entities.TipoGarantia;
import es.alop.noorm.entities.VersaoMensagem;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class DataDTO {
	List<TipoGarantia> tipoGarantia;
	VersaoMensagem versao;
}
