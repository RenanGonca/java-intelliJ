import java.util.Scanner;
/**
 * Escreva a descrição da classe Main aqui.
 * @author Renan Gonçalves
 * @version 1.0
 * since 05/04/2020
 */
public class Main {
    
    public static void main(String args[]){
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);
        
        Algoritmo algoritmo = new Algoritmo();
        
        System.out.println("Digite o valor 1: ");
        algoritmo.setValor1(scanner.nextInt());
        System.out.println("Digite o valor 2: ");
        algoritmo.setValor2(scanner.nextInt());
        System.out.println("Digite o valor 3: ");
        algoritmo.setValor3(scanner.nextInt());
        System.out.println(algoritmo.mostrarMenu());
        int opcao = scanner.nextInt();
        System.out.println(algoritmo.verificarOpcao(opcao));
        
    }
}