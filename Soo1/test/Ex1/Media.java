package Ex1;

import javax.swing.JOptionPane;

public class Media {
    private float calculoMedia;
    
    public void calcularMedia(float n1, float n2, float n3, int p1, int p2, int p3){     
        this.calculoMedia = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
        JOptionPane.showMessageDialog(null, "Média das notas: " + this.calculoMedia);
    }
}
