package entities;

import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Double> moeda = new ArrayList<>();

    public void adicionar(double valor) {
        moeda.add(valor);
        System.out.println("Moeda de " + valor + " adicionada!");
    }

    public void remover(double valor){
        moeda.remove(valor);
        System.out.println("Moeda de " + valor + " removida!");
    }

    public void listagemMoedas(){
        System.out.println(moeda);
    }



}
