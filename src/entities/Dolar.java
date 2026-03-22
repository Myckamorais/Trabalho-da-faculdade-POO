package entities;

public class Dolar extends Moeda{

    public Dolar(double valor){
        this.valor = valor;
    }

    @Override
    public void info() {
        System.out.printf("Dólar - Valor: $ %.2f%n", valor);
    }

    @Override
    public double converter(){
        return this.valor * 5.10;
    }

    @Override
    public String toString() {
        return "Dólar: " + valor;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Dolar outraMoeda = (Dolar) obj;
        return Double.compare(outraMoeda.valor, this.valor) == 0;
    }

}
