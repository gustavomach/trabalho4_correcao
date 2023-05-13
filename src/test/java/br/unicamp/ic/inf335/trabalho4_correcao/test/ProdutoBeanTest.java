package br.unicamp.ic.inf335.trabalho4_correcao.test;

import java.util.ArrayList;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;


import br.unicamp.ic.inf335.trabalho4_correcao.beans.ProdutoBean;
import org.junit.jupiter.api.Test;

class ProdutoBeanTest {
	
	private static ArrayList<ProdutoBean> produtos1 = new ArrayList<ProdutoBean>();
	private static ArrayList<ProdutoBean> produtos2 = new ArrayList<ProdutoBean>();
	
	@Test
	void testaOrdenacao() {
		// Criando vetor 1 desordenado
		ProdutoBean nProg = new ProdutoBean("CD00001","Produto 1", "Bla Bla Bla",2000.0,"Bla Bla Bla");
		produtos1.add(nProg);
		nProg = new ProdutoBean("CD00003","Produto 3", "Bla Bla Bla",500.0,"Bla Bla Bla");
		produtos1.add(nProg);
		nProg = new ProdutoBean("CD00002","Produto 2", "Bla Bla Bla",1000.0,"Bla Bla Bla");
		produtos1.add(nProg);
			
		
		// Criando vetor 2 já ordenado em ordem crescente
		ProdutoBean nProg2 = new ProdutoBean("CD00003","Produto 3", "Bla Bla Bla",500.0,"Bla Bla Bla");
		produtos2.add(nProg2);
		nProg2 = new ProdutoBean("CD00002","Produto 2", "Bla Bla Bla",1000.0,"Bla Bla Bla");
		produtos2.add(nProg2);
		nProg2 = new ProdutoBean("CD00001","Produto 1", "Bla Bla Bla",2000.0,"Bla Bla Bla");
		produtos2.add(nProg2);
		
		// Ordenando vetor 1
		Collections.sort(produtos1);
		
		assertTrue(produtos1.equals(produtos1));
		
	}
	
}
