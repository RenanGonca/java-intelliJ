
/**
 * Classe abstrata Escola - escreva a descrição da classe aqui
 * 
 * @author (Renan)
 * since (03/04/2020)
 * @version 1.0
 */
public abstract class Escola{
    
    private String nome;
    private String sobrenome;
    private double nota1;
    private double nota2;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public abstract String verConceito();
}