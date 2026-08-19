package org.example;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }

        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }
}