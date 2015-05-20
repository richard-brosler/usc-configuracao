package br.usc.segusc.configuracao.services;

import br.usc.segusc.configuracao.impl.Configuracao;

public class ConfiguracaoFactory {
	private static ConfiguracaoFactory inst;
	private Configuracao conf;
	
	private ConfiguracaoFactory(){
		conf= new Configuracao();
	}
	
	public static ConfiguracaoFactory getInstance(){
		if (inst==null)
			inst = new ConfiguracaoFactory();
		return inst;
	}
	
	public static IConfiguracaoService getConfiguracaoServiceImpl(){
		return getInstance().conf;
	}
}
