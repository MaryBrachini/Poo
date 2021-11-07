package Ex3;

import javax.swing.JOptionPane;

public class PFuncionario {

    public static void main(String[] args) {
        funcionario salf = new funcionario();

        double sal, vv;

        sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salario: "));
        vv = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de vendas: "));
        
        salf.calcularSalario(sal, vv);
    }
}
