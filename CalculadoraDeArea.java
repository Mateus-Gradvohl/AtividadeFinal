import java.util.Scanner;

public class CalculadoraDeArea extends Calculadora{

        Calculadora areaDaFigura = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        double variavelA,variavelB;

        public void quadrado(){
            System.out.print("Informe o valor da base: ");
            variavelA = scanner.nextDouble();
            System.out.print("Informe o valor a altura: ");
            variavelB = scanner.nextDouble();
            System.out.println("Resposta: " + areaDaFigura.multiplicar(variavelA, variavelB) );
        }
        public void circuferencia(){
            variavelB = 2;
            double ValorDePI = 3.14;
            System.out.print("informe o valor do raio da circunferência: ");
            variavelA = scanner.nextDouble();
            System.out.print("Resultado: " + ValorDePI * areaDaFigura.exponencial(variavelA,variavelB));
        }
        public void trapezio(){
            System.out.print("Informe a altura do trapézio: ");
            double alturaTrapezio = scanner.nextDouble();
            System.out.print("Informe o valor da maior base do trapézio: ");
            variavelA = scanner.nextDouble();
            System.out.print("Informe o valor da menor base do trapézio: ");
            variavelB = scanner.nextDouble();
            System.out.println("Resultado: " + areaDaFigura.somar(variavelA, variavelB) * alturaTrapezio);
        }
        public void tiangulo(){
            System.out.print("Infome a altura do triângulo: ");
            variavelA = scanner.nextDouble();
            System.out.print("Informe o comprimento da base do triângulo: ");
            variavelB = scanner.nextDouble();
            System.out.println("Resultado: " + areaDaFigura.multiplicar(variavelA, variavelB) / 2);
        }
}