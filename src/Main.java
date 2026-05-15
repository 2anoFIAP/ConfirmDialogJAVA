import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        do {
            try {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de mensagem z\n1. Informação \n2. Aviso"));
                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Mensagem de informacao", "informacao", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mensagem de Aviso", "Aviso", JOptionPane.WARNING_MESSAGE);
                        break;
                    default:
                        throw new Exception("Opcao invalida");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?",
                "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
