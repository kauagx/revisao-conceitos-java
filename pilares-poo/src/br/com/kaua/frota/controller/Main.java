package br.com.kaua.frota.controller;

import br.com.kaua.frota.model.*;
import br.com.kaua.frota.service.Frota;
import java.util.Scanner;
import java.util.InputMismatchException;

import static br.com.kaua.frota.service.Frota.cadastrarVeiculos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Frota frota = new Frota();
        boolean valido = false;
        int qtd = 0;

        while (!valido) {
            System.out.println("Quantos veículos deseja cadastrar?");
            try {
                qtd = sc.nextInt();
                if (qtd > 0) {
                    valido = true;
                } else {
                    System.out.println("Erro, não aceitamos números negativos ou zero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas a quantidade de veículos que deseja cadastrar!!!");
                sc.nextLine();
            }
        }

        cadastrarVeiculos(sc, frota, qtd);

        long totalCarros = frota.getVeiculo().stream()
                .filter(v -> v instanceof Carro)
                .count();

        long totalMotos = frota.getVeiculo().stream()
                .filter(v -> v instanceof Moto)
                .count();

        long total = frota.getVeiculo().size();

        System.out.println("\n--- Resumo dos veículos cadastrados ---");
        System.out.println("Carros: " + totalCarros);
        System.out.println("Motos: " + totalMotos);
        System.out.println("Total de veículos: " + total);

        System.out.println("\n--- Lista de veículos ---");
        frota.listarVeiculos();

        sc.close();
    }
}
