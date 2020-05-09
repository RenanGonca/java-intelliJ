/**
 * Write a description of class Principal here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 14:47
 */
import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Scanner scanner = new Scanner(System.in);
        
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o numero1: ");
        calculadora.setNumero1(scanner.nextDouble());
        System.out.println("Digite o numero2: ");        
        calculadora.setNumero2(scanner.nextDouble());
        
        System.out.println(calculadora.mostrarMenu());
        int opcao = scanner.nextInt();
        
        System.out.println(calculadora.verificarOpcao(opcao));
        
    }
    
}
