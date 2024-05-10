package model;

import view.VooEER;
import view.VooPPJ;

import javax.swing.JOptionPane;
import java.util.Objects;

public class funcoes_DAO {
    // Criando vetores
    public static String[] assentosEER = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String[] assentosPPJ = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};

    // Criando as funções
    public static String[] reservaEER() {
        if (VooEER.x == 1) {
            if (assentosEER[0].equals("1[X]") && assentosEER[1].equals("2[X]") && assentosEER[2].equals("3[X]") && assentosEER[3].equals("4[X]") && assentosEER[4].equals("5[X]") && assentosEER[5].equals("6[X]")) {
                JOptionPane.showMessageDialog(null, "Voo está lotado");
            } else {
                switch (VooEER.op) {
                    case 1:
                        if (Objects.equals(assentosEER[0], "1[ ]")) {
                            assentosEER[0] = "1[X]";
                            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                        } else if (Objects.equals(assentosEER[0], "1[X]")) {
                            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                        }
                        break;
                    case 2:
                        if (Objects.equals(assentosEER[1], "2[ ]")) {
                            assentosEER[1] = "2[X]";
                            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                        } else if (Objects.equals(assentosEER[1], "2[X]")) {
                            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                        }
                        break;
                    case 3:
                        if (Objects.equals(assentosEER[2], "3[ ]")) {
                            assentosEER[2] = "3[X]";
                            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                        } else if (Objects.equals(assentosEER[2], "3[X]")) {
                            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                        }
                        break;
                    case 4:
                        if (Objects.equals(assentosEER[3], "4[ ]")) {
                            assentosEER[3] = "4[X]";
                            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                        } else if (Objects.equals(assentosEER[3], "4[X]")) {
                            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                        }
                        break;
                    case 5:
                        if (Objects.equals(assentosEER[4], "5[ ]")) {
                            assentosEER[4] = "5[X]";
                            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                        } else if (Objects.equals(assentosEER[4], "5[X]")) {
                            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                        }
                        break;
                    case 6:
                        if (Objects.equals(assentosEER[5], "6[ ]")) {
                            assentosEER[5] = "6[X]";
                            JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                        } else if (Objects.equals(assentosEER[5], "6[X]")) {
                            JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                        }
                        break;
                }
            }
        }
        return assentosEER;
    }

    public static String[] reservaPPJ() {
        if (VooPPJ.x == 2) {
            if (assentosPPJ[0].equals("1[X]") && assentosPPJ[1].equals("2[X]") && assentosPPJ[2].equals("3[X]") && assentosPPJ[3].equals("4[X]") && assentosPPJ[4].equals("5[X]") && assentosPPJ[5].equals("6[X]")) {
                JOptionPane.showMessageDialog(null, "Voo está lotado");
            } else {
                try {
                    switch (VooPPJ.op) {
                        case 1:
                            if (Objects.equals(assentosPPJ[0], "1[ ]")) {
                                assentosPPJ[0] = "1[X]";
                                JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                            } else if (Objects.equals(assentosPPJ[0], "1[X]")) {
                                JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                            }
                            break;
                        case 2:
                            if (Objects.equals(assentosPPJ[1], "2[ ]")) {
                                assentosPPJ[1] = "2[X]";
                                JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                            } else if (Objects.equals(assentosPPJ[1], "2[X]")) {
                                JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                            }
                            break;
                        case 3:
                            if (Objects.equals(assentosPPJ[2], "3[ ]")) {
                                assentosPPJ[2] = "3[X]";
                                JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                            } else if (Objects.equals(assentosPPJ[2], "3[X]")) {
                                JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                            }
                            break;
                        case 4:
                            if (Objects.equals(assentosPPJ[3], "4[ ]")) {
                                assentosPPJ[3] = "4[X]";
                                JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                            } else if (Objects.equals(assentosPPJ[3], "4[X]")) {
                                JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                            }
                            break;
                        case 5:
                            if (Objects.equals(assentosPPJ[4], "5[ ]")) {
                                assentosPPJ[4] = "5[X]";
                                JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                            } else if (Objects.equals(assentosPPJ[4], "5[X]")) {
                                JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                            }
                            break;
                        case 6:
                            if (Objects.equals(assentosPPJ[5], "6[ ]")) {
                                assentosPPJ[5] = "6[X]";
                                JOptionPane.showMessageDialog(null, "Assento reservado com sucesso!");
                            } else if (Objects.equals(assentosPPJ[5], "6[X]")) {
                                JOptionPane.showMessageDialog(null, "O assento já foi reservado!");
                            }
                            break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
            }
        }
        return assentosPPJ;
    }
}
