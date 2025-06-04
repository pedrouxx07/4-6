package aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha qual das seçoes voce quer consultar: 1, 2 ou 3: ");
        int escolha = teclado.nextInt();

        if (escolha == 1) {
            Secao1 secao = new Secao1();
            secao.cadastrar(teclado);
        } else if (escolha == 2) {
            Secao2 secao = new Secao2();
            secao.cadastrar(teclado);
        } else if (escolha == 3) {
            Secao3 secao = new Secao3();
            secao.cadastrar(teclado);
        } else {
            System.out.println("Essa seçao não existe.");
        }

        teclado.close();
        
        public void exibirDados() {
     System.out.println("Consulta cadastrada:");
       System.out.println("Seção: " + secao1);
    System.out.println("Paciente: " + paciente.getNome() + " | CPF: " + paciente.getCpf());
  System.out.println("Médico: " + medico.getNome());
    }
}
