/*
Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.
Faça um programa que receba o salário fixo de um funcionário e o valor de 
suas vendas, calcule e mostre a comissão e o salário final do funcionário.
 */
package Ex3;

import javax.swing.JOptionPane;

public class funcionario {

    private double salf,comi;

    public void calcularSalario(double sal, double vv) {
        comi = vv * 0.04;
        
        this.salf = sal + comi;
        JOptionPane.showMessageDialog(null, "O salario final do funcionario é de: " + this.salf);
    }
}
