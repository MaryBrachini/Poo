package Ex1;

import javax.swing.JOptionPane;

public class Pmedia {
    public static void main(String[] args){
        Media mediaPonderada = new Media();
        
        float n1, n2, n3;
        int p1, p2, p3;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
        p1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro peso: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
        p2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo peso: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
        p3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro peso: "));
        
        mediaPonderada.calcularMedia(n1, n2, n3, p1, p2, p3);
        
    }//fecha main
}//fecha classe
