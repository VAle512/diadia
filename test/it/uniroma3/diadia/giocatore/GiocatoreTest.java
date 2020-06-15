package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;


public class GiocatoreTest {
	
	private Giocatore giocatore;
	
	@Before
	public void setUp() {
		this.giocatore = new Giocatore();
	}
	
	@Test
	public void testCfuNonFinitiInizioPartita() {
		assertNotEquals(0,this.giocatore.getCfu());
	}
	
	@Test
	public void testCfuIniziali() {
		assertEquals(Giocatore.CFU_INIZIALI,this.giocatore.getCfu());
	}

}
