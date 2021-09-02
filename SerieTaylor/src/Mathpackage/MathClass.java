package Mathpackage;
//Metodos matematicos Basicos

public class MathClass {
   
    //Metodo potencia que recibe dos parametros x(valor numero)
    //i(numero de veces que se realizara el producto x 
    public double mPotencia(double numero, int repeticiones){
        double potencia = 1 ;
        for(int k = 1; k <= repeticiones; k++){
            potencia = potencia * numero;
        } 
        return potencia;
    }

    //Metodo de Factorial
    public double mFactorial(double n) {
        double resultado = 1;
        while (n != 0) {
            resultado = resultado * n;
            n--;
        }
        return resultado;
    }

    public double fFactorial(int numero) {
        return (numero == 0 || numero == 1) ? 1 : numero * fFactorial(numero - 1);
    }
}
