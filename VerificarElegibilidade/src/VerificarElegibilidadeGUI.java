
import javax.swing.*;

public class VerificarElegibilidadeGUI {

    public static void main(String[] args) {
        // Cria um novo frame
        JFrame frame = new JFrame("Verificar Elegibilidade para Conta Bancária");
        frame.setSize(400, 200); // Define o tamanho do frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão de fechar o frame

        // Cria um painel para adicionar componentes
        JPanel panel = new JPanel();
        frame.add(panel); // Adiciona o painel ao frame
        placeComponents(panel); // Configura os componentes no painel

        // Define o frame como visível
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Define o layout do painel como nulo

        // Cria um rótulo para a entrada de idade
        JLabel userLabel = new JLabel("Idade:");
        userLabel.setBounds(10, 20, 80, 25); // Define a posição e o tamanho do rótulo
        panel.add(userLabel); // Adiciona o rótulo ao painel

        // Cria um campo de texto para entrada da idade
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25); // Define a posição e o tamanho do campo de texto
        panel.add(userText); // Adiciona o campo de texto ao painel

        // Cria um botão para verificar a elegibilidade
        JButton verifyButton = new JButton("Verificar");
        verifyButton.setBounds(10, 80, 150, 25); // Define a posição e o tamanho do botão
        panel.add(verifyButton); // Adiciona o botão ao painel

        // Cria uma área de texto para mostrar o resultado
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 350, 25); // Define a posição e o tamanho da área de texto
        resultArea.setEditable(false); // Torna a área de texto não editável
        panel.add(resultArea); // Adiciona a área de texto ao painel

        // Adiciona a ação ao botão usando expressão lambda
        verifyButton.addActionListener(e -> {
            try {
                // Tenta converter o texto inserido para um número inteiro
                int idade = Integer.parseInt(userText.getText());
                // Verifica se a idade é maior ou igual a 18
                if (idade >= 18) {
                    // Se a idade for maior ou igual a 18, exibe mensagem de elegibilidade
                    resultArea.setText("Voce esta elegivel para criar uma conta bancaria.");
                } else {
                    // Se a idade for menor que 18, exibe mensagem de não elegibilidade
                    resultArea.setText("Voce nao esta elegivel para criar uma conta bancaria.");
                }
            } catch (NumberFormatException ex) {
                // Se ocorrer um erro ao converter a idade, exibe mensagem de erro
                resultArea.setText("Por favor, insira uma idade válida.");
            }
        });
    }
}
