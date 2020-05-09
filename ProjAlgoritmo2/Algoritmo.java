
/**
 * Escreva a descrição da classe Algoritmo aqui.
 * @author Renan Gonçalves
 * @version 1.0
 * since 05/04/2020
 */
public class Algoritmo implements IAlgoritmo{
    
    private int valor1;
    private int valor2;
    private int valor3;
    
    public int getValor1() {
        return this.valor1;
    }
    
    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }
    
     public int getValor2() {
        return this.valor2;
    }
    
    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }
    
     public int getValor3() {
        return this.valor3;
    }
    
    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }
    
    @Override
    public String verCrescente() {
       if(this.getValor1() < this.getValor2() && this.getValor2() < this.getValor3() && this.getValor1() < this.getValor3()) {
            return this.getValor1() + "-" + this.getValor2() + "-" + this.getValor3();
        } else if(this.getValor1() < this.getValor3() && this.getValor3() < this.getValor2() && this.getValor1() < this.getValor2()) {
            return this.getValor1() + "-" + this.getValor3() + "-" + this.getValor2();
        } else if(this.getValor2() < this.getValor3() && this.getValor2() < this.getValor1() && this.getValor1() < this.getValor3()) {
            return this.getValor2() + "-" + this.getValor1() + "-" + this.getValor3();
        } else if(this.getValor2() < this.getValor3() && this.getValor3() < this.getValor1() && this.getValor2() < this.getValor1()) {
            return this.getValor2() + "-" + this.getValor3() + "-" + this.getValor1();
        } else if(this.getValor3() < this.getValor1() && this.getValor1() < this.getValor2() && this.getValor3() < this.getValor2()) {
            return this.getValor3() + "-" + this.getValor1() + "-" + this.getValor2();
        } else if(this.getValor3() < this.getValor2() && this.getValor2() < this.getValor1() && this.getValor3() < this.getValor1()) {
            return this.getValor3() + "-" + this.getValor2() + "-" + this.getValor1();
        } else if(this.getValor1() == this.getValor2() && this.getValor2() == this.getValor3() && this.getValor1() == this.getValor3()) {
            return "Invalido";
        }
       return "Invalido";
    }
    
    @Override
    public String verDecrescente() {
        if(this.getValor1() > this.getValor2() && this.valor2 > this.getValor3() && this.valor1 > this.valor3) {
            return this.getValor1() + "-" + this.getValor2() + "-" + this.getValor3();
        } else if(this.getValor1() > this.getValor3() && this.valor3 > this.getValor2() && this.valor1 > this.valor2) {
            return this.getValor1() + "-" + this.getValor3() + "-" + this.getValor2();
        } else if(this.getValor2() > this.getValor3() && this.valor2 > this.getValor1() && this.valor1 > this.valor3) {
            return this.getValor2() + "-" + this.getValor1() + "-" + this.getValor3();
        } else if(this.getValor2() > this.getValor3() && this.valor3 > this.getValor1() && this.valor2 > this.valor1) {
            return this.getValor2() + "-" + this.getValor3() + "-" + this.getValor1();
        } else if(this.getValor3() > this.getValor1() && this.valor1 > this.getValor2() && this.valor3 > this.valor2) {
            return this.getValor3() + "-" + this.getValor1() + "-" + this.getValor2();
        } else if(this.getValor3() > this.getValor2() && this.valor2 > this.getValor1() && this.valor3 > this.valor1) {
            return this.getValor3() + "-" + this.getValor2() + "-" + this.getValor1();
        } else if(this.getValor1() == this.getValor2() && this.getValor2() == this.getValor3() && this.getValor1() == this.getValor3()) {
            return "Invalido";
        }
        return "Invalido";
    }
    
    public String mostrarMenu() {
        return "\nDigite uma opcao:"
                         + "\n1 - Ver em Ordem Crescente"
                         + "\n2 - Ver Ordem Decrescente"
                         + "\n3 - Ver Ambos";
    }
    
    public String verificarOpcao(int opcao) {
        switch(opcao) {
            case 1: return "\nVer Ordem Crescente: " +this.verCrescente();            
            case 2: return "\nVer Ordem Decrescente: " +this.verDecrescente(); 
            case 3: return "\nVer Ambos: " + toString();
            default: return "ERRO, OPÇÃO INVÁLIDA!";
        }
    }
    
    @Override
    public String toString() {
        return "\nVer em ordem Crescente: " + verCrescente()
             + "\nVer em ordem Decrescente: " + verDecrescente();
    }
}
