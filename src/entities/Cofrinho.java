package entities;

import java.util.ArrayList;

public class Cofrinho {

    // Vai listar e guardar a Classe Moeda
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
        System.out.println("Moeda de " + moeda + " adicionada!");
    }

    public void remover(Moeda moeda){
        listaMoedas.remove(moeda);
        System.out.println("Moeda de " + moeda + " removida!");
    }

    public void listagemMoedas(){
        //Vai mostrar as informacoes das moedas
        for (Moeda m : listaMoedas){
            m.info();
        }
    }

    public double totalConvertido() {
        double total = 0;
        for ( Moeda m : listaMoedas) {
             total += m.converter();// O polimorfismo acontece aqui!
        }
        return total;
    }

}
