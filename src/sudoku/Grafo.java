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
    int lin,col;
    
    Grafo(String linha){
        aresta = new int[27][9];
        tabela = new Vertice[81];
        int k=0;
        for(int i=0;i<81;i++){
        	tabela[i] = new Vertice(i,9,linha.charAt(k++));
        }
    }
    void printGrafo(){
    	for(int i=0;i<81;i++){    		
    		if(i%9==0)
    			System.out.println();
    		System.out.print(tabela[i].cor+" ");
        }
    }
    //cria aresta para sudoku 9x9;
    void criaAresta(){
    	for(int i=0;i<9;i++){
    		for(int j=0;j<9;j++){
    			aresta[i][j]=i*9+j;	
    		}
    	}
    	
    	for(int i=9;i<18;i++){
    		for(int j=0;j<9;j++){
    			aresta[i][j]=i-9+j*9;
    		}	
    	}
    	int a=0;
    	for(int i=18,k=0;i<27;i++,k++){
    		
    		for(int j=0;j<3;j++){
    			aresta[i][j]=j+k*3;
    			a++;
    			
    		}
    		for(int j=0;j<3;j++){
    			aresta[i][j]=j+9+k*3;
    			a++;
    			
    		}
    		for(int j=0;j<3;j++){
    			aresta[i][j]=j+18+k*3;
    			a++;
    			
    		}
    		if(a%27==0)k+=6;
    		
    	}
    }
    void atualizarCores(){
    	
    }
}
