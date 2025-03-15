package org.example;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private double salario;
    private boolean aposentado;

    public Pessoa(String nome, int idade, char sexo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = Character.toUpperCase(sexo);
        this.salario = salario;
        this.aposentado = verificarAposentadoria();
    }

    private boolean verificarAposentadoria() {
        return (sexo == 'H' && idade >= 65) || (sexo == 'M' && idade >= 62);
    }

    public void exibirInformacoes() {
        System.out.println("\n----- Dados da Pessoa -----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + (sexo == 'H' ? "Homem" : "Mulher"));
        System.out.printf("Salário: R$%.2f%n", salario);
        System.out.println("Aposentado: " + (aposentado ? "Sim" : "Não"));
    }
}

