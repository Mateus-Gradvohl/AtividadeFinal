import java.util.Scanner;


public class CalculadoraDeVolume extends Calculadora {
    
    Calculadora volume = new Calculadora();
    Scanner scanner = new Scanner(System.in);


    public void cubo(){
    System.out.print("Informe o valor da aresta do cubo: ");
    variavelA = scanner.nextDouble();
    System.out.println("O volume em m³ do cubo é: " + volume.exponencial(variavelA, 3));
    }
    
    public void esfera(){
        System.out.print("Informe o valor do raio da esfera: ");
        variavelA = scanner.nextDouble();
        System.out.println("O volume em m³ da esfera é: " + volume.multiplicar(volume.exponencial(variavelA, 3), 4/3*Math.PI));
    }
    public void paralelepipedo(){
        double variavelC;
        System.out.print("Informe o valor da aresta1: ");
        variavelA = scanner.nextDouble();
        System.out.print("Informe o valor da aresta2: ");
        variavelB = scanner.nextDouble();
        System.out.print("Informe o valor da aresta3: ");
        variavelC = scanner.nextDouble();
        System.out.println("O volume em m³ do paralelepipedo é: " + volume.multiplicar(volume.multiplicar(variavelA, 3), variavelC));
    }


}