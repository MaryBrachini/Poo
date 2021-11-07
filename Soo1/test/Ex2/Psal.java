package Ex2;

import javax.swing.JOptionPane;

public class Psal {
    public static void main(String[] args){
        Sal objSal = new Sal();
        
        double sal, por;
        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário atual: "));
        por = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de aumento: "));
        
        objSal.calculoAumento(sal, por);
    }
}
