package aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Sistema de Consultas ");
        System.out.println("Escolha a seção para realizar o cadastro (1, 2 ou 3): ");
        int escolha = teclado.nextInt();

        if (escolha == 1) {
            seçao1.cadastrar1(teclado);
        } else if (escolha == 2) {
            seçao2.cadastrar2(teclado);
        } else if (escolha == 3) {
            seçao3.cadastrar3(teclado);
        } else {
            System.out.println("Seção inválida.");
        }

        teclado.close();
    }
}
