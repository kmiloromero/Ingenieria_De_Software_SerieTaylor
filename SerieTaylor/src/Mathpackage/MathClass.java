/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mathpackage;

/**
 *
 * @author Romero
 */
public class MathClass {
    
    /* Metodo potencia que recibe dos parametros x(valor numero)
     * i(numero de veces que se realizara el producto x
    */
    public float potencia(float x, int i){
        float pot = 1 ;
        for(int k = 1; k <= i; k++){
            pot = pot * x;
        } 
        return pot;
    }
}
