public class Quadrado {
    private double lado;

    public void valorLado(double novoValor){
        lado = novoValor;
    }

    public double mostraValor(){
        return lado;
    }

    public void calcularArea(){
        double area = lado * lado;
    }
    
}
