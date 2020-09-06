package es.alop.noorm.data.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class VersaoMensagem {

	Date dat_rfrc_vers;
	Long num_vers_prdo_rfrc;
	Date dat_hor_carg_vers;
	String ind_vers_ativ;

}
