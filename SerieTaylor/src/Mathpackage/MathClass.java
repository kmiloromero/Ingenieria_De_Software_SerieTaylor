package Mathpackage;
//Metodos matematicos Basicos

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


    double resultado = 1;

    //Metodo de Factorial
    public float Factorial(double n) {
        while (n != 0) {
            resultado = resultado * n;
            n--;
        }
        return (float) resultado;
    }

    public double Ofactorial(int o) {
        return (o == 0 || o == 1) ? 1 : o * Ofactorial(o - 1);
    }


}
