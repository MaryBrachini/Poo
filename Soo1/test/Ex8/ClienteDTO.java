/*Implementar o exemplo demonstrado no Vídeo 10 da aula 
encapsulamento onde o enunciado é: Construa um programa que solicite o nome,
idade e rg de um cliente. Deve ser construído um método para mostrar na tela 
somente o nome e o rg e outro método para mostra na tela o nome e a idade desse
cliente. Deve ser utilizado o controle de exceção e padrão MVC.
OBS: Você NÃO deve compactar os arquivos para enviar.*/
package Ex8;

public class ClienteDTO {

    private String nome, rg;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
