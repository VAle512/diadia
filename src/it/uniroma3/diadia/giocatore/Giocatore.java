package it.uniroma3.diadia.giocatore;
public class Giocatore {

	static final public int CFU_INIZIALI = 20;

	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa();
	}

	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}

	public Borsa getBorsa() {
		return this.borsa;
	}
	
	@Override
	public String toString() {
		return this.cfu + this.borsa.toString();
	}
	
}
