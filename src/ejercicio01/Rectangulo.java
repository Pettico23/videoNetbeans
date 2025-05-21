
package ejercicio01;


public class Rectangulo {
    private double ancho;
    private double alto;
    
    
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularArea(){
        double result;
        result = alto * ancho;
        return result;
    
    }
    public double calularPerimetro(double largo,double ancho){
        
        return 2 * (largo + ancho);
        

    }
    public boolean esCuadrado(){
    
        boolean result;
        result = ancho == alto;
        return result;
    }
}
