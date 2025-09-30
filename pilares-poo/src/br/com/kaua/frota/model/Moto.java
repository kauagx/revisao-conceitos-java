package br.com.kaua.frota.model;

public class Moto extends Veiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void cadastrar() {
        System.out.println("Moto da marca " + getMarca() + " cadastrada.");
    }
}
