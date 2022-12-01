import java.util.Scanner;

public class CalculadoraSaldo extends Calculadora {

    Calculadora saldo = new Calculadora();
    Scanner scanner = new Scanner(System.in);
   
    public void valorSaldo(){
        
    	double saldoAnterior = 1000;
    	   	
        System.out.println("O seu saldo atual é " + saldoAnterior +" Qual o valor do saque?");
        double saque = scanner.nextDouble();
        
        double saldo = saldoAnterior - saque ;
		System.out.println("O seu novo saldo é " + saldo);

    }

}