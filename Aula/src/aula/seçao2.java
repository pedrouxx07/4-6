package aula;

import java.util.Scanner;

public class Secao1 {
    public void cadastrar(Scanner teclado) {
        System.out.println("Seçao 2 - Cadastro");

        System.out.print("Nome do paciente: ");
        String nomePaciente = teclado.next();

        System.out.print("CPF do paciente: ");
        String cpfPaciente = teclado.next();

        System.out.print("Nome do medico: ");
        String nomeMedico = teclado.next();

        Paciente paciente = new Paciente(nomePaciente, cpfPaciente);
        Medico medico = new Medico(nomeMedico);
        Consulta consulta = new Consulta(paciente, medico, 1);

        consulta.exibirDados();
    }
}
