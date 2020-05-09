/**
 * Escreva a descrição da classe Main aqui.
 * @author (Renan Gonçalves)
 * @version 1.0
 * since 04/04/2020
 */
import java.util.Scanner;
public class Main {
   
    public static void main(String args[]) {
        System.out.println("\f");
        Scanner scanner = new Scanner(System.in);
        
        Pessoa pessoa = new Pessoa();
        System.out.println("Digite seu nome: ");
        pessoa.setNome(scanner.nextLine());
        System.out.println("Digite sua idade: ");
        pessoa.setIdade(scanner.nextInt());
        System.out.println("Digite sua sexo: ");
        pessoa.setSexo(scanner.next());
        System.out.println("Digite sua Peso: ");
        pessoa.setPeso(scanner.nextDouble());
        System.out.println("Digite sua Altura: ");
        pessoa.setAltura(scanner.nextDouble());
        System.out.println(pessoa);
    }
}