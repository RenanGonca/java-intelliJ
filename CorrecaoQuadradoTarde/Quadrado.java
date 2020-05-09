/**
 * Abstract class Quadrado - write a description of the class here
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 02/04/2020 - 14:!4
 */
public class Quadrado extends FormaGeometrica {
    
    private double lado;
    
    public double getLado() {
        return this.lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    /**
     * @return Retorna a área do quadrado, lado ao quadrado
     */
    @Override    
    public double calcularArea() {
        return Math.pow(this.lado, 2); 
        //return this.lado * this.lado;
    }
    
    /**
     * @return Retorna o perímetro do quadrado, lado * 4
     */
    @Override 
    public double calcularPerimetro() {
        return this.lado * 4;
    }
    
    @Override
    public String toString() {
        return "\nLado: " + this.lado
              +"\nArea: " + this.calcularArea()
              +"\nPerimetro: " + this.calcularPerimetro();
    }
    
}
