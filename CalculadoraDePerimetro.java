import java.util.Scanner;

public class CalculadoraDePerimetro extends Calculadora {
    
    Calculadora perimetro = new Calculadora();
    Scanner scanner = new Scanner(System.in);

    public void perimetroTerreno(){ 
        double variavelC;
        double variavelD;
        double total;
        System.out.print("Informe o valor da medida 1 em 'metros' do Terreno: ");
        variavelA = scanner.nextDouble();
        System.out.print("Informe o valor da medida 2 em 'metros' do Terreno: ");
        variavelB = scanner.nextDouble();
        System.out.print("Informe o valor da medida 3 em 'metros' do Terreno: ");
        variavelC = scanner.nextDouble();
        System.out.print("Informe o valor da medida 4 em 'metros' do Terreno: ");
        variavelD = scanner.nextDouble();
        total = perimetro.somar(variavelA, variavelB) + perimetro.somar(variavelC, variavelD);
        System.out.println("O perímetro em metros do terreno é: " + total);
    }
}
