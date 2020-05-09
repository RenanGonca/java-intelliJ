/**
 * Classe abstrata Peso - escreva a descrição da classe aqui
 * 
 * @author (Renan Gonçalves)
 * @version 1.0
 * since 04/04/2020
 */
public abstract class Peso {
    
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private double altura;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public abstract String verificarIMC();
    public abstract double calcularMassaCorporal();
}
