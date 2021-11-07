package Ex8;

import javax.swing.JOptionPane;

public class ClienteVIEW {

    public static void main(String[] args) {
        try {
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();

            clienteDTO.setNome(JOptionPane.showInputDialog("Informe o nome "));
            clienteDTO.setRg(JOptionPane.showInputDialog("Informe o Rg "));
            clienteDTO.setIdade(Integer.parseInt("Informe a idade "));

            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no Sistema: " + e.getMessage());
        }

    }
}
