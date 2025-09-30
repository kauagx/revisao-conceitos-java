package br.com.kaua.frota.model;

public abstract class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void cadastrar();
}
