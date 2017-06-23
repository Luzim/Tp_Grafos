/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Igor
 */
public class Grafo {
    int [][]aresta;
    Vertice []tabela;
    
    Grafo(String linha){
        aresta = new int[21][9];
        tabela = new Vertice[21];
        for(int i=0;i<21;i++){
            tabela[i] = new Vertice(i,21,linha.charAt(i));
        }
    }
}
