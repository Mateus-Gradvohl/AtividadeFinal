import java.util.Scanner;

public class CalculadoraDeJuros extends Calculadora {
    
    Calculadora calculadora = new Calculadora();
    Scanner scanner = new Scanner(System.in);

    double capital,taxa,montante,juros;
    int tempo = 1;
    int valorFixo = 1;

    public void jurosCompostos (){
        System.out.print("Informe o capital inicial: ");
        capital = scanner.nextDouble();
        System.out.print("Informe o percentual da taxa corrente (Exemplo: 1.5, para 1,5%):");
        taxa = scanner.nextDouble() / 100;
        System.out.println("Informe o a quantidade de mêses: ");
        tempo = scanner.nextInt();

        montante = calculadora.somar(valorFixo, taxa);
        montante = calculadora.exponencial(montante, tempo );
        montante = calculadora.multiplicar(capital,montante);

        System.out.println("Resultado: " + montante);
    }
    public void jurosSimples(){
        System.out.println("Informe o capital inicial: ");
        capital = scanner.nextDouble();
        System.out.print("Informe o percentual da taxa corrente (Exemplo: 1.5, para 1,5%):");
        taxa = scanner.nextDouble() / 100;
        System.out.println("Informe o a quantidade de mêses: ");
        tempo = scanner.nextInt();

        juros = calculadora.multiplicar(capital, taxa);
        juros = calculadora.multiplicar(juros, tempo);
        montante = calculadora.somar(juros, capital);

        System.out.println("Resultado: " + montante);
    }
}