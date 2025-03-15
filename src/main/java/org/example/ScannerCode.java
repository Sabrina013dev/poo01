package org.example;
import java.util.Scanner;

public class ScannerCode {
    private static final Scanner scan = new Scanner(System.in);

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scan.nextLine();
    }

    public static int lerInt(String mensagem) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (scan.hasNextInt()) {
                valor = scan.nextInt();
                scan.nextLine(); // Limpa a memoria temporaria (buffer?)
                break;
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scan.next(); // Vai descartar a entrada que esta errada.
            }
        }
        return valor;
    }

    public static double lerDouble(String mensagem) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            if (scan.hasNextDouble()) {
                valor = scan.nextDouble();
                scan.nextLine(); // buffer
                break;
            } else {
                System.out.println("Entrada inválida! Digite um número decimal válido.");
                scan.next(); // Descarta entrada inválida
            }
        }
        return valor;
    }

    public static char lerChar(String mensagem, char... opcoesValidas) {
        char valor;
        while (true) {
            System.out.print(mensagem);
            String entrada = scan.next().toUpperCase();
            scan.nextLine(); // buffer
            if (entrada.length() == 1) {
                valor = entrada.charAt(0);
                for (char opcao : opcoesValidas) {
                    if (valor == opcao) {
                        return valor;
                    }
                }
            }
            System.out.println("Entrada inválida! Digite uma opção válida.");
        }
    }

    public static void fecharScanner() {
        scan.close();
    }
}


