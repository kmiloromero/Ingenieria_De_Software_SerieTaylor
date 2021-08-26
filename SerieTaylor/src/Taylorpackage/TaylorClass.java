/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Taylorpackage;
/*Se importa el paquete defunciones Mathpackage para utilizacion de operaciones
 *exponecial, factorial */
import Mathpackage.*;
/**
 *
 * @author Romero
 */
public class TaylorClass {
    
    public float senX(float valor){
        //atributos necesarios para aproximar la funcion SenX
        byte count = 1;
        int potencia = 1;
        int potencia2 = 3;
        float resultado;
        float sumapositiva = 0;
        float sumanegativa = 0;
        
        MathClass Mc = new MathClass();
        do{
            sumapositiva = sumapositiva + (Mc.mPotencia(valor, potencia))/Mc.mFactorial(potencia);
            potencia += 4;
            sumanegativa = sumanegativa - (Mc.mPotencia(valor, potencia2))/Mc.fFactorial(potencia2);
            potencia += 4;
            count++;
        }while(count < 4);
         resultado = sumapositiva + sumanegativa;
        return resultado;     
    }    
}
