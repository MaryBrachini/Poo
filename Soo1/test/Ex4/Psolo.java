package Ex4;

import javax.swing.JOptionPane;

public class Psolo {

    public static void main(String[] args) {

        Solo amostraSolo = new Solo();

        double pon;

        pon = Double.parseDouble(JOptionPane.showInputDialog("Informe pontuação de água presente no solo"));
        amostraSolo.calcularSolo(pon);

    }
}
