package Ex7;

import javax.swing.JOptionPane;

public class Pletra {

    public static void main(String[] args) {
        letras obj = new letras();
        int a = 0, e = 0, i = 0, o = 0, u = 0, c = 0;
        String let;

        do {
            let = JOptionPane.showInputDialog("Digite uma letra ou 0(zero) para sair: ");
            obj.calcular(let);
        } while (!let.equalsIgnoreCase("0"));

        obj.Mostrar();
    }
}
