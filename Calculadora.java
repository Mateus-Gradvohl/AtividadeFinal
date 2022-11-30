
public class Calculadora { 

    public double variavelA, variavelB;
    //METODOS A SEREM IMPLEMENTADOS 

    public double somar(double variavelA, double variavelB) {
        return variavelA + variavelB;
    }
    public double subtrair(double variavelA, double variavelB) {
        return variavelA - variavelB;
    }
    public double multiplicar(double variavelA, double variavelB) {
        return variavelA * variavelB;
    }
    public double dividir(double variavelA, double variavelB){
        if(variavelB != 0) {
            return variavelA / variavelB;
       }
       else {
           System.out.println("O divisor não pode ser 0");
           throw new DivisorZero ("Erro: o divisor não pode ser 0");
       }
    }
    public double exponencial(double variavelA, double variavelB){
        return Math.pow(variavelA, variavelB);
    }
    public double raizQuad(double variavelA){
        return Math.sqrt(variavelA)
    }
    public double piso(){
        return Math.floor(variavelA);   
    }
    public double teto(){
        return Math.ceil(variavelA);
    }
}
