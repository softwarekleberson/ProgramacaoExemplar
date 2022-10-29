package esiii2022.negocio.impl;

import esiii2022.dominio.Dependente;
import esiii2022.dominio.EntidadeDominio;
import esiii2022.negocio.IStrategy;

public class ValidarParentesco implements IStrategy {

	public String processar(EntidadeDominio entidade) {
		Dependente dependente = (Dependente)entidade;
		String parentesco = dependente.getParentesco().getDescricao();
		if(parentesco.equals("CONJUGE") || parentesco.equals("FILHO")){
			return "Um dependente só pode ser CONJUGE ou FILHO";
		}
		return null;
	}

}
