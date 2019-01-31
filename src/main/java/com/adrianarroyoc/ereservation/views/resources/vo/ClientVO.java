package com.adrianarroyoc.ereservation.views.resources.vo;

import lombok.Data;

/**
 * Class that represents the client virtual object class
 * @author adrianarroyoc
 *
 */

@Data
public class ClientVO {
	
	private String nameCli;
	private String lastNameCli;
	private String identificationCli;
	private String addressCli;
	private String phoneCli;
	private String emailCli;
	
}
