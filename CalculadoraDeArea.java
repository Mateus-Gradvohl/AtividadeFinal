import java.util.Scanner;

public class CalculadoraDeArea extends Calculadora{

        Calculadora areaDaFigura = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        double VariavelA,VariavelB;

        public void quadrado(){
            System.out.print("Informe o valor da base: ");
            VariavelA = scanner.nextDouble();
            System.out.print("Informe o valor a altura: ");
            VariavelB = scanner.nextDouble();
            System.out.println("Resposta: " + areaDaFigura.multiplicar(VariavelA, VariavelB) );
        }
        public void circuferencia(){
            VariavelB = 2;
            double ValorDePI = 3.14;
            System.out.print("informe o valor do raio da circunferência: ");
            VariavelA = scanner.nextDouble();
            System.out.print("Resultado: " + ValorDePI * areaDaFigura.exponencial(VariavelA,VariavelB));
        }
        public void trapezio(){
            System.out.print("Informe a altura do trapézio: ");
            double alturaTrapezio = scanner.nextDouble();
            System.out.print("Informe o valor da maior base do trapézio: ");
            VariavelA = scanner.nextDouble();
            System.out.print("Informe o valor da menor base do trapézio: ");
            VariavelB = scanner.nextDouble();
            System.out.println("Resultado: " + areaDaFigura.somar(VariavelA, VariavelB) * alturaTrapezio);
        }
        public void tiangulo(){
            System.out.print("Infome a altura do triângulo: ");
            VariavelA = scanner.nextDouble();
            System.out.print("Informe o comprimento da base do triângulo: ");
            VariavelB = scanner.nextDouble();
            System.out.println("Resultado: " + areaDaFigura.multiplicar(VariavelA, VariavelB) / 2);
        }
}