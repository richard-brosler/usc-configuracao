package br.usc.segusc.configuracao.services;

import br.usc.segusc.configuracao.exception.ConfiguracaoInvalidaException;

public interface IConfiguracaoService {
	public String getValue(String key) throws ConfiguracaoInvalidaException;
}
