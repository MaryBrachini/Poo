/*
Você está fazendo um trabalho de classificação de solo.
Após colher uma amostra e verificar a pontuação de água presente nela, classificou a amostra em:
    Rochosa: se menos ou igual a 10 pontos de água;
    Firme: se mais do 10 pontos e menor ou igual a 40 pontos;
    Pantanosa: se mais do 40 pontos e menor ou igual a 80 pontos;
    Caso seja maior que 80 pontos escrever a mensagem: "Quantidade de água inválida".
OBS: Deve ser utilizado os conceitos de IF/ELSE.
 */
package Ex4;

import javax.swing.JOptionPane;

public class Solo {

    private double pon;

    public void calcularSolo(double pon) {

        if (pon <= 10) {
            JOptionPane.showMessageDialog(null, "Tipo de solo rochoso");
        } else {
            if ((pon >= 10) && (pon <= 40)) {
                JOptionPane.showMessageDialog(null, "Tipo de solo firme");
            } else {
                if ((pon >= 40) && (pon <= 80)) {
                    JOptionPane.showMessageDialog(null, "Tipo de solo pantanosa");
                } else {
                    JOptionPane.showMessageDialog(null, "Quantidade de água inválida");
                }
            }
        }
    }
}