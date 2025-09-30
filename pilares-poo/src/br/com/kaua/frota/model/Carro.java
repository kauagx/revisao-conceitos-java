package br.com.kaua.frota.model;

public class Carro extends Veiculo {
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void cadastrar() {
        System.out.println("Carro da marca " + getMarca() + " cadastrado.");
    }
}
