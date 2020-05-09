/** 
 * @author (Renan)
 * @version (03/04/2020)
 * since 1.0
 */
public class Algoritmo extends Mes {
    
    public String verificarMes() {
        if(this.getMes() == 1) {
            return "\nJaneiro";
        } else if(this.getMes() == 2) {
            return "\nFevereiro";
        } else if(this.getMes() == 3) {
            return "\nMarço";
        } else if(this.getMes() == 4) {
            return "\nAbril";
        } else if(this.getMes() == 5) {
            return "\nMaio";
        } else if(this.getMes() == 6) {
            return "\nJunho";
        } else if(this.getMes() == 7) {
            return "\nJulho";
        } else if(this.getMes() == 8) {
            return "\nAgosto";
        } else if(this.getMes() == 9) {
            return "\nSetembro";
        } else if(this.getMes() == 10) {
            return "\nOutubro";
        } else if(this.getMes() == 11) {
            return "\nNovembro";
        }    else if(this.getMes() == 12) {
            return "\nDezembro";
        } else {
            return "Mês Inválido";
        }
    }
      
    public String toString() {
            return "Mês: " + this.verificarMes();
    }
}
