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
    Vertice [][]tabela;
    int lin,col;
    
    Grafo(String linha){
        aresta = new int[21][9];
        tabela = new Vertice[9][9];
        int k=0;
        for(int i=0;i<9;i++){
        	for(int j=0;j<9;j++)
        		tabela[i][j] = new Vertice(i,9,linha.charAt(k++));
        }
    }
    void printGrafo(){
    	for(int i=0;i<9;i++){
    		for(int j=0;j<9;j++)
    			System.out.print(tabela[i][j].cor+" ");
            System.out.println();
        }
    }
}
