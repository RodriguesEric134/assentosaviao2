package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Graf_GUI extends JFrame{
    private JPanel menu;
    private JButton vooPPJDBButton;
    private JButton vooEER134Button;

    public Menu_Graf_GUI() {
        setContentPane(menu);
        setTitle("Menu");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        //Voo 1
        vooPPJDBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VooPPJ VooPPJ = new VooPPJ();
                VooPPJ.setVisible(true);
                dispose();
            }
        });
        //Voo 2
        vooEER134Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VooEER VooEER = new VooEER();
                VooEER.setVisible(true);
                dispose();
            }
        });
    }
}
