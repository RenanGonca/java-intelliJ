
/**
 * Escreva a descrição da classe Aluno aqui.
 * @author (Renan)
 * since (03/04/2020)
 * @version 1.0
 */
public class Aluno extends Escola {
    
    public double calcularMedia() {
        return (this.getNota1() + this.getNota2()) / 2;
    }
    
    public String verConceito() {
        if(calcularMedia() >= 9 && calcularMedia() <= 10) {
            return "Aprovado, Conceito A";
        } else if(calcularMedia() >= 8 && calcularMedia() <= 8.9) {
            return "Aprovado, Conceito B";
        } else if(calcularMedia() >= 7 && calcularMedia() <= 7.9) {
            return "Aprovado, Conceito C";
        } else {
            return "Reprovado, Conceito D";
        }
    }
    
    @Override
    public String toString() {
        return "\nAluno: " + this.getNome() + this.getSobrenome()
             + "\nNota 1: " + this.getNota1()
             + "\nNota 2: " + this.getNota2()
             + "\nConceito do Aluno: " + this.verConceito();
    }
}