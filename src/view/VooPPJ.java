package view;

import model.funcoes_DAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static model.funcoes_DAO.assentosVooPPJ;

public class VooPPJ extends JFrame {

    private JButton sairButton;
    private JTextField digiteSeuAssentoTextField;
    private JLabel[] assentosLabels = new JLabel[6];
    private JPanel PPJ;


    public VooPPJ(){
        setContentPane(PPJ);
        setTitle("VOO: PPJ-DBD");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        for (int i = 0; i < assentosLabels.length; i++) {
            assentosLabels[i] = new JLabel();
            assentosLabels[i].setText(assentosVooPPJ[i]);
            assentosLabels[i].setName("assento_" + (i + 1));
            PPJ.add(assentosLabels[i]);
        }

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu_Graf_GUI telaMenu = new Menu_Graf_GUI();
                telaMenu.setVisible(true);
                dispose();
            }
        });

        digiteSeuAssentoTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int op = Integer.parseInt(digiteSeuAssentoTextField.getText());
                    funcoes_DAO.VooPPJ(op);

                    for (int i = 0; i < assentosLabels.length; i++) {
                        assentosLabels[i].setText(funcoes_DAO.assentosVooPPJ[i]);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }
}
