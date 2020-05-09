/**
 * Escreva a descrição da classe Main aqui.
 * @author (Renan)
 * @version (03/04/2020)
 * since 1.0
 */
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
    
        System.out.println("\f");
       
        Scanner scanner = new Scanner(System.in);
        
        Algoritmo algoritmo = new Algoritmo();
       
        System.out.println("Digite o Mês: ");
        algoritmo.setMes(scanner.nextInt());
        
        System.out.println(algoritmo);
        
     }
}