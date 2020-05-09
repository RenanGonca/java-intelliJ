
/**
 * Write a description of class Calculadora here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 14:35
 */
public class Calculadora {
   
    private double numero1;
    private double numero2;
    
    public Calculadora() {
    }
    
    public double getNumero1() {
        return this.numero1;
    } 
    
    public void setNumero1(double numero1) {
        this.numero1 = (numero1>=0) ? numero1 : 0.0;
    }
    
    public double getNumero2() {
        return this.numero2;
    } 
    
    public void setNumero2(double numero2) {
        this.numero2 = (numero2>=0) ? numero2 : 0.0;
    }    
    
    public double somar() {
        return this.numero1 + this.numero2;
    }
    
    public double subtrair() {
        return this.numero1 - this.numero2;
    }
    
    public double dividir() {
        return this.numero1 / this.numero2;
    }    
    
    public String mostrarMenu() {
        return "\nDigite uma opcao:"
                         + "\n1-somar"
                         + "\n2-subtrair"
                         + "\n3-dividir"
                         + "\n4-multiplicar"
                         + "\n5-todos"; 
    }
    
    public String verificarOpcao(int opcao) {
        switch(opcao) {
            case 1: return "\nSoma: " + this.somar();
            case 2: return "\nSubtração: " + this.subtrair();
            case 3: return "\nDivisão " + this.dividir();
            case 4: return "\nMultiplicação: " + this.multiplicar();
            case 5: return toString();
            default: return "Vishhhhhhhh... deu erro!";
        }
    }
    
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }    
    
    @Override
    public String toString() {
        return "\nNúmero 1: " + this.numero1
             + "\nNúmero 2: " + this.numero2
             + "\nSoma: " + this.somar()
             + "\nSubtração: " + this.subtrair()
             + "\nMultiplicação: " + this.multiplicar()             
             + "\nDivisão: " + this.dividir();
             
    }
    
}
