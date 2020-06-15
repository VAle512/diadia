package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando {

	private final String[] elencoComandi;
	private IO io;
	private final static String NOME = "aiuto";
	
	public ComandoAiuto(String[] elencoComandi) {
		this.elencoComandi = elencoComandi;
	}
	
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< this.elencoComandi.length; i++) 
			this.io.mostraMessaggio(this.elencoComandi[i]+" ");
		this.io.mostraMessaggio("");
	}

	@Override
	public void setParametro(String parametro) { }

	@Override
	public void setIO(IO io) {
		this.io = io;
	}

	@Override
	public String getNome() {
		return NOME;
	}

	@Override
	public String getParametro() {
		return null;
	}

}
