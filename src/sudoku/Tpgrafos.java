/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.io.IOException;

/**
 *
 * @author Igor
 */
public class Tpgrafos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String linha = new String();
        linha = leArquivo.leitor("sudoku.txt");
        
        System.out.println(linha);
        Grafo tabela = new Grafo(linha);
        tabela.criaAresta();
        tabela.printGrafo();
    }
    
}
