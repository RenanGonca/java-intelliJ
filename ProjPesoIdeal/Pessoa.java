
/**
 * Escreva a descrição da classe ProgramaPeso aqui.
 * @author (Renan Gonçalves)
 * @version 1.0
 * since 04/04/2020
 */
public class Pessoa extends Peso {
    
    public double calcularMassaCorporal() {
        return this.getPeso()/(this.getAltura() * this.getAltura());
    }
    
    public String verificarIMC() {
        if(calcularMassaCorporal() >= 18.50 && calcularMassaCorporal() <= 24.99) {
            return "Peso Normal";
        } else if(calcularMassaCorporal() >= 25.00 && calcularMassaCorporal() <= 29.99) {
            return "Acima do Peso";
        } else if(calcularMassaCorporal() >= 30.00 && calcularMassaCorporal() <= 34.99) {
            return "Obesidade I";
        } else if (calcularMassaCorporal() >= 35.00) {
            return "Obesidade II (severa)";
        } else {
            return "Abaixo do peso";
        }
    }
    
    public String toString() {
        return "Nome: " + this.getNome()
             + "\nIdade: " + this.getIdade()
             + "\nSexo: " + this.getSexo()
             + "\nPeso: " + this.getPeso()
             + "\nAltura: " + this.getAltura()
             + "\nMassa Corporal: " + (Math.round(this.calcularMassaCorporal()))
             + "\nIMC(Indice Massa Corporal): " + this.verificarIMC();
    }
}