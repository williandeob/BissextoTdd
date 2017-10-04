package br.ufg.inf.tacs.bissexto;

import org.junit.Assert;
import org.junit.Test;

public class TesteBissexto {

	@Test
	public void ehBissexto(){
		int ano = 2016;
		Bissexto bissexto = new Bissexto();
		Assert.assertTrue(bissexto.ehBissexto(ano));
		
	}
	
	@Test
	public void naoEhBissexto(){
		int ano = 2015;
		Bissexto bissexto = new Bissexto();
		Assert.assertFalse(bissexto.ehBissexto(ano));
	}
	
}
