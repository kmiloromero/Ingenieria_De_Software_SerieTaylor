/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mainpackage;
//import de las librerias necesarias
import java.util.Scanner;
import Taylorpackage.*;

/**
 *
 * @author Romero
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        //PRUEBA 1 DE LA FUNCION SenX()
        double x,y;
        TaylorClass obj = new TaylorClass();
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite el un valor en grados: ");
        float val = entrada.nextFloat();                      //Se solicita por teclado un valor en grados al usuario
        x = val*3.141592/180.0;                               //Se realiza la conversion a radianes del valor ingresado 
        y = obj.senX(x);                                      //Se llama al metodo SenX() del package MathClass  
        System.out.println(" senX(" + val + ") = " + y );    
    }
}