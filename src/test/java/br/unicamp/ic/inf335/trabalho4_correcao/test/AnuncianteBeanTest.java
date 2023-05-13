package br.unicamp.ic.inf335.trabalho4_correcao.test;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.trabalho4_correcao.beans.AnuncianteBean;
import br.unicamp.ic.inf335.trabalho4_correcao.beans.AnuncioBean;
import br.unicamp.ic.inf335.trabalho4_correcao.beans.ProdutoBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.ArrayList;

class AnuncianteBeanTest {
	
    private static AnuncianteBean anunciante;
    @Test
	void validaValorMedioAnuncios() {
		anunciante = new AnuncianteBean("Gustavo", "123.123.123-12", new ArrayList<AnuncioBean>());
		
		ProdutoBean produto1 = new ProdutoBean("CD00001","Produto 1", "Bla Bla Bla",1000.0,"Bla Bla Bla");
		ProdutoBean produto2 = new ProdutoBean("CD00002","Produto 2", "Bla Bla Bla",1000.0,"Bla Bla Bla");
		ArrayList<URL> fotosUrl = new ArrayList<URL>();
        Double desconto1 = 0.1;
        Double desconto2 = 0.3;
        
        AnuncioBean anuncio1 = new AnuncioBean(produto1, fotosUrl, desconto1);
        AnuncioBean anuncio2 = new AnuncioBean(produto2, fotosUrl, desconto2);
        
        anunciante.addAnuncio(anuncio1);
        anunciante.addAnuncio(anuncio2);
        
        assertEquals(800.0, anunciante.valorMedioAnuncios(), 0.01);
        
	}
	
}
