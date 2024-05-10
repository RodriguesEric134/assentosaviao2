package view;

import model.funcoes_DAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class VooPPJ extends JFrame {
    public static String option = "";
    public static int op;
    public static int x = 2;
    private JButton sairButton;
    private JTextField digiteSeuAssentoTextField;

    private JLabel assento_1;
    private JLabel assento_2;
    private JLabel assento_3;
    private JLabel assento_4;
    private JLabel assento_5;
    private JLabel assento_6;
    private JPanel PPJ;

    public VooPPJ() {
        setContentPane(PPJ);
        setTitle("VooPPJ-DBD");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        assento_1.setText(funcoes_DAO.assentosPPJ[0]);
        assento_2.setText(funcoes_DAO.assentosPPJ[1]);
        assento_3.setText(funcoes_DAO.assentosPPJ[2]);
        assento_4.setText(funcoes_DAO.assentosPPJ[3]);
        assento_5.setText(funcoes_DAO.assentosPPJ[4]);
        assento_6.setText(funcoes_DAO.assentosPPJ[5]);

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu_Graf_GUI tela = new Menu_Graf_GUI();
                tela.setVisible(true);
                setLocationRelativeTo(null);
                dispose();
            }
        });

        //campo de texto
        digiteSeuAssentoTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    option = digiteSeuAssentoTextField.getText();
                    op = Integer.parseInt(option); // converte o valor digitado em um inteiro

                    if (op < 1 || op > 6) {
                        throw new IllegalArgumentException("O valor inserido é inválido!");
                    }
                    funcoes_DAO.reservaPPJ();
                    assento_1.setText(funcoes_DAO.assentosPPJ[0]);
                    assento_2.setText(funcoes_DAO.assentosPPJ[1]);
                    assento_3.setText(funcoes_DAO.assentosPPJ[2]);
                    assento_4.setText(funcoes_DAO.assentosPPJ[3]);
                    assento_5.setText(funcoes_DAO.assentosPPJ[4]);
                    assento_6.setText(funcoes_DAO.assentosPPJ[5]);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Insira um número válido.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
