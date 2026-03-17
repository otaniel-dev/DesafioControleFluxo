import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();

            Contar.imprimirResultado(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Apenas números são aceitos para os parametros");
        }
        scanner.close();
    }
}