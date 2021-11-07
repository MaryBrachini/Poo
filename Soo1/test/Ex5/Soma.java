/*Faça um algoritmo que receba 10 números inteiros e ao final mostre Soma soma dos mesmos.
OBS: Deve ser criado um método para somar os números e outro para mostrar o resultado*/
package Ex5;

import javax.swing.JOptionPane;

public class Soma {

    private int sm, n, i;

    public void calcularSoma() {
        this.n = n;
        for (i = 1; i <= 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
      
            sm +=n;
        }
    }

    public void MostrarSoma() {
        JOptionPane.showMessageDialog(null, "A soma dos números são: " + sm);
    }
}
