package Ex6;

import javax.swing.JOptionPane;

public class Pnumero {

    public static void main(String[] args) {
        Numeros obj = new Numeros();
        int n, i;

        for (i = 1; i <= 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
         obj.calcular(n);
        }

        obj.Mostrar();
    }
}
