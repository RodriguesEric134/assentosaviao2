package model;

import javax.swing.JOptionPane;
import java.util.Objects;

public class funcoes_DAO {
    // Criando vetores
    public static String[] assentosVooPPJ = {"1 - [ ]", "2 - [ ]", "3 - [ ]", "4 - [ ]", "5 - [ ]", "6 - [ ]"};
    public static String[] assentosVooEER = {"1 - [ ]", "2 - [ ]", "3 - [ ]", "4 - [ ]", "5 - [ ]", "6 - [ ]"};

    // Função genérica para realizar a reserva de assentos
    public static String[] reservarAssento(String[] assentos, int op) {
        int assentoSelecionado = op - 1;
        if (Objects.equals(assentos[assentoSelecionado], (op + " - [ ]"))) {
            assentos[assentoSelecionado] = (op + " - [X]");
            JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
        } else if (Objects.equals(assentos[assentoSelecionado], (op + " - [X]"))) {
            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
        }
        return assentos;
    }

    // Função específica para o voo PPJ
    public static String[] VooPPJ(int op) {
        return reservarAssento(assentosVooPPJ, op);
    }

    // Função específica para o voo EER
    public static String[] VooEER(int op) {
        return reservarAssento(assentosVooEER, op);
    }
}
