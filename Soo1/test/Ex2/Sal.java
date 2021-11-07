package Ex2;

import javax.swing.JOptionPane;

public class Sal {
    private double salf;
    
    public void calculoAumento(double sal, double por){
        this.salf = sal + (sal * por / 100);
        JOptionPane.showMessageDialog(null, "O salário final é de: R$" + this.salf);    
    }
}
