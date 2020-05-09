    
/**
 * Escreva a descrição da classe AlgoritmoFF aqui.
 * @author (Renan)
 * @version 1.0
 * since (03/04/2020)
 */
public class FastFood extends Produto {
    private double valorCodigo1;
    private double valorCodigo2;
    private double valorCodigo3;
    private double valorCodigo4;
    private int quantidade;
    
    public FastFood() {
        
    }
        
    public int getQuantidade() {
        return this.quantidade;
    }
        
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
    public double getValorCodigo1() {
        return this.valorCodigo1;
    }
        
    public void setValorCodigo1(double valorCodigo1) {
        this.valorCodigo1 = valorCodigo1;
    }
        
    public double getValorCodigo2() {
        return this.valorCodigo2;
    }
        
    public void setValorCodigo2(double valorCodigo2) {
        this.valorCodigo2 = valorCodigo2;
    }
        
    public double getValorCodigo3() {
        return this.valorCodigo3;
    }
        
    public void setValorCodigo3(double valorCodigo3) {
        this.valorCodigo3 = valorCodigo3;
    }
        
    public double getValorCodigo4() {
        return this.valorCodigo4;
    }
        
    public void setValorCodigo4(double valorCodigo4) {
        this.valorCodigo4 = valorCodigo4;
    }
        
    public double sanduiche() {
        return this.valorCodigo1 * this.quantidade;
    }
        
    public double suco() {
        return this.valorCodigo2 * this.quantidade;
    }
        
    public double pastel() {
        return this.valorCodigo3 * this.quantidade;
    }
        
    public double farroupilha() {
        return this.valorCodigo4 * this.quantidade;
    }
    
    public String verificarCodigo(int codigo) {
        switch(codigo) {
             case 1:
                return "\nSanduíche de Presunto, Valor Final: " + this.sanduiche();
             case 2:
                return "\nSuco de Tamarindo, Valor Final: " + this.suco();
             case 3:
                return "\nPastel com ovo, Valor Final: " + this.pastel();
             case 4:
                return "\nFarroupilha, Valor Final: " + this.farroupilha();
             default:
                return "\nOpção Inválida Selecionada!";
        }
    } 
        
    public String selecionarProduto(int codigo) {
        switch(codigo) {
             case 1:
                return "\n1 - Sanduíche de Presunto";
             case 2:
                return "\n2 - Suco de Tamarindo";
             case 3: 
                return "\n3 - Pastel com ovo"; 
             case 4:
                return "\n4 - Farroupilha";
             default:
                return "\nOpção Inválida Selecionada!";
        }
    }
    
    public String toString() {
        return "**********MENU FAST FOOD**********" 
             + "\n1 > Sanduíche de Presunto (R$3,65)"
             + "\n2 > Suco de Tamarindo (R$2,50)"
             + "\n3 > Pastel com ovo (R$3,30)"
             + "\n4 > Farroupilha (R$4,70)"
             + "\n**********MENU FAST FOOD**********";
    }
 }