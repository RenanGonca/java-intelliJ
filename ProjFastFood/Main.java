
/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (Renan)
 * @version 1.0
 * since (03/04/2020)
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String args[]) {
        System.out.println("\f");
        Scanner scanner= new Scanner(System.in);
        
        FastFood fastFood = new FastFood();
        fastFood.setValorCodigo1(3.65);
        fastFood.setValorCodigo2(2.50);
        fastFood.setValorCodigo3(3.30);
        fastFood.setValorCodigo4(4.70);
        System.out.println(fastFood);
        System.out.println("\nDigite o código do Produto: ");
        int codigo = scanner.nextInt();
        System.out.println(fastFood.selecionarProduto(codigo));
        System.out.println("\nDigite a Quantidade do Produto: ");
        fastFood.setQuantidade(scanner.nextInt());
        System.out.println(fastFood.verificarCodigo(codigo));
    }
}
