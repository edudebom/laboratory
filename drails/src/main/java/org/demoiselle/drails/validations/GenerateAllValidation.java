package org.demoiselle.drails.validations;

import java.io.File;

import org.demoiselle.drails.constants.CommandsConstant;
import org.demoiselle.drails.exceptions.ValidationException;
import org.demoiselle.drails.util.CommonsValidations;

public class GenerateAllValidation implements Validation {

	private File project;
	private String line;

	public GenerateAllValidation(File project, String line) {
		this.project = project;
		this.line = line;
	}

	@Override
	public void validate() throws ValidationException {
		
		if(!CommonsValidations.verifyIfDrailsProject(project)){
			throw new ValidationException("Projeto não compatível com Drails !");
		}
		
		String[] params = line.split(" ");
		
		if(params.length != 2){
			throw new ValidationException("Parâmetros inválidos, utilize: " + CommandsConstant.GENERATE_ALL + " <domínio>");
		}

		String domainName = params[1].trim();
		
		if(!"*".equals(domainName)){
			if(!CommonsValidations.verifyIfDomainExists(project, domainName)){
				throw new ValidationException("Domínio " + domainName + " informado não foi encontrado!");			
			}
		}

	}

}
