package com.cofrinho.moedas;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        moedas.remove(moeda);
    }

    public List<Moeda> listagemMoedas() {
        for (Moeda obj : moedas) {
            System.out.println(obj.info() + obj.valor);
        }
        return moedas;
    }

    public double totalConvertido() {
        double total = 0;
        for (Moeda obj : moedas) {
            double valorConvertido = obj.converter(obj.valor);
            total += valorConvertido;
        }
        return total;
    }
}
