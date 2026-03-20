package entities;

public class Dolar extends Moeda{

    double valor;

    public Dolar(double valor){
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.println("Dólar - Valor: " + valor);
    }

    @Override
    public double converter(){
        return this.valor * 5.10;
        //Valor do
    }

}
