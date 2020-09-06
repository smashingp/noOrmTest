package es.alop.noorm.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class TipoGarantia {

	Date dat_rfrc_vers;
	Long num_vers_prdo_rfrc;
	Long cod_tipo_gara;
	String nom_tipo_gara;
	
}
