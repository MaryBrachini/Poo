/*Faça um algoritmo que solicite 10 números inteiros. Ao final o algoritmo deve informar o maior e o menor número digitado.
OBS: Deve ser criado um método para verificar os números e outro somente para mostrar o resultado.
OBS: Todas as mensagens podem ser feitas somente na Classe Principal, ou seja, as
informações devem ser solicitadas na classe Principal e enviadas para classe secundária onde será realizada
os cálculos e testes se necessário. A classe secundária deve devolver a resposta para a classe
Principal onde a mesma será mostrada ao usuário*/
package Ex6;

import javax.swing.JOptionPane;

public class Numeros {

    private int mai = 0, men = 0;

    public void calcular(int n) {

        if (n > mai) {
            mai = n;
        }
        if (n < men) {
            men = n;

        }

    }

    public void Mostrar() {
        JOptionPane.showMessageDialog(null, "O número maior é " + mai + " e o número menor é " + men);
    }
}
