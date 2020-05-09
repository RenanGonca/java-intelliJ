
/**
 * Classe abstrata Produto - escreva a descrição da classe aqui
 * 
 * @author (Renan)
 * @version 1.0
 * since (03/04/2020)
 */
public abstract class Produto {
    private int codigo;
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public abstract String verificarCodigo(int codigo);
}