package br.com.kaua.frota.service;

import br.com.kaua.frota.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frota {
    private List<Veiculo> lista = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v) {
        lista.add(v);
    }

    public List<Veiculo> getVeiculo() {
        return lista;
    }

    public void listarVeiculos() {
        for (Veiculo v : lista) {
            v.cadastrar();
        }
    }

    public static void cadastrarVeiculos(Scanner sc, Frota frota, int qtd) {
        for (int i = 0; i < qtd; i++) {
            String tipo = "";
            boolean tipoValido = false;

            while (!tipoValido) {
                System.out.print("Digite o tipo (carro/moto): ");
                tipo = sc.next();

                if (tipo.equalsIgnoreCase("carro") || tipo.equalsIgnoreCase("moto")) {
                    tipoValido = true;
                } else {
                    System.out.println("Tipo inválido, digite novamente!");
                }
            }

            System.out.print("Digite a marca: ");
            String marca = sc.next();

            if (tipo.equalsIgnoreCase("carro")) {
                frota.adicionarVeiculo(new Carro(marca));
            } else {
                frota.adicionarVeiculo(new Moto(marca));
            }
        }
    }
}
