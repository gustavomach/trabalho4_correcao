package br.unicamp.ic.inf335.trabalho4_correcao.test;

import static org.junit.jupiter.api.Assertions.*;
import java.net.URL;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.unicamp.ic.inf335.trabalho4_correcao.beans.AnuncioBean;
import br.unicamp.ic.inf335.trabalho4_correcao.beans.ProdutoBean;

class AnuncioBeanTest {
	
    @Test
    void zeroDescontoRetornaOriginal() {
        // Criando um produto com valor igual a 100
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);

        // criando anuncio sem desconto
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        AnuncioBean anuncioTeste = new AnuncioBean(produto, fotosUrl, 0.0);

        // O valor do anuncio deveria ser igual ao valor do produto
        assertEquals(100.0, anuncioTeste.getValor());
    }
    
    
    @Test
    void descontoMetadeDoPreco() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(1000.0);

        // anuncio com 50% de desconto
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        AnuncioBean anuncioTeste = new AnuncioBean(produto, fotosUrl, 0.5);

        // o valor do anuncio deveria ser de 500
        assertEquals(500.0, anuncioTeste.getValor());
    }

    
    @Test
    void descontoTotal() {
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(1000.0);

        // anuncio com 100% de desconto
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        AnuncioBean anuncioTeste = new AnuncioBean(produto, fotosUrl, 1.0);

        // o valor do anuncio deveria ser de 500
        assertEquals(0.0, anuncioTeste.getValor());
    }
    
    
    @Test
    void descontoNegativo() {
    	// Criando um produto com valor igual a 100
        ProdutoBean produto = new ProdutoBean();
        produto.setValor(100.0);

        // criando anuncio sem desconto
        ArrayList<URL> fotosUrl = new ArrayList<URL>();
        AnuncioBean anuncioTeste = new AnuncioBean(produto, fotosUrl, -0.4);

        // O valor do anuncio deveria ser igual ao valor do produto
        assertEquals(100.0, anuncioTeste.getValor());
    	
    }
    
}
