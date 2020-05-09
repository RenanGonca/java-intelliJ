
/**
 * Classe abstrata Mes - escreva a descrição da classe aqui
 * 
 * @author (Renan)
 * @version (03/04/2020)
 * since 1.0
 */
public abstract class Mes {
     private int mes;
    
     public int getMes() {
         return this.mes;
     }
     
      public void setMes(int mes) {
         this.mes = mes;
     }
     
     public abstract String verificarMes();
}