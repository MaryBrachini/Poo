/*Construa um algoritmo que solicite uma letra até que 0 (zero) seja digitado.

Ao final o algoritmo deve informar a quantidade de cada vogal digitada, ou seja,
a quantidade de A, a quantidade de E, a quantidade de I, a quantidade de O e a
quantidade de U. Deve ser informado também a quantidade total de consoantes que foram digitadas.

OBS: O número 0 (zero) não pode ser computado.
OBS: Deve ser criado um método para verificar as letras e outro para mostrar o resultado.
OBS: A única classe que pode interagir com o usuário é a classe Principal.*/
package Ex7;

import javax.swing.JOptionPane;

public class letras {

    private String let;
    private int a, e, i, o, u, c;

    public int calcular(String let) {
        this.a = a;
        this.e = e;
        this.i = i;
        this.o = o;
        this.u = u;
        this.c = c;

        if (let.equalsIgnoreCase("a")) {
            this.a++;
        } else {
            if (let.equalsIgnoreCase("e")) {
                this.e++;
            } else {
                if (let.equalsIgnoreCase("i")) {
                    this.i++;
                } else {
                    if (let.equalsIgnoreCase("o")) {
                        this.o++;
                    } else {
                        if (let.equalsIgnoreCase("u")) {
                            this.u++;
                        } else {
                            this.c++;
                        }
                    }
                }
            }
        }

        return this.a + this.e + this.i + this.o + this.u + this.c;
    }

    public void Mostrar() {

        JOptionPane.showMessageDialog(null, "\nA quantidade de vogais são: " + a + " para A, " + e + " para E, " + i + " para I, " + o + " para O, " + u + " para U e " + c + " para as Consoantes");

    }

}
