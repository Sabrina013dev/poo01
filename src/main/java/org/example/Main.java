package org.example;

public class Main {
    public static void main(String[] args) {
        String nome = ScannerCode.lerString("Qual seu nome? : ");
        int idade = ScannerCode.lerInt("Qual a sua idade? : ");
        char sexo = ScannerCode.lerChar("Digite seu sexo ('M' ou 'H'): ", 'M', 'H');
        double salario = ScannerCode.lerDouble("Quanto você ganha? : ");

        Pessoa pessoa = new Pessoa(nome, idade, sexo, salario);
        pessoa.exibirInformacoes();

        ScannerCode.fecharScanner();
    }
}