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
public class Vertice {
    int[]cores;
    public int cor;
    Vertice(){}
    Vertice(int index,int tam, char valor){
        tam+=5;
    	cores =new int[tam];
        
        for(int i=0;i<tam;++i){
            cores[i] = 0;
        	cor=0;            
        }
        if(valor=='0'){
	        for(int i=0;i<tam;++i){
	            cores[i] = 1;
	        }
	        cor = 0;
        }
        else{
        	cores[Character.getNumericValue(valor)]=Character.getNumericValue(valor);
        	cor = Character.getNumericValue(valor);
        }
    }
}
