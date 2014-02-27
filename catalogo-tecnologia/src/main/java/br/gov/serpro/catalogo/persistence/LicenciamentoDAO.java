package br.gov.serpro.catalogo.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.gov.serpro.catalogo.entity.Licenciamento;

@PersistenceController
public class LicenciamentoDAO extends JPACrud<Licenciamento, Long> {

	private static final long serialVersionUID = 1L;
	
}
