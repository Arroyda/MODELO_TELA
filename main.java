import javax.swing.*;
import java.awt.*; // Importando o pacote correto para layout

public class main { // Corrigido: nome da classe deve começar com letra maiúscula

    public static void main(String[] args) {
        JFrame frame = new JFrame("Modelo Tela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Corrigido: método setDefaultCloseOperation e a classe JFrame
        frame.setSize(490, 292);
        frame.setLayout(new BorderLayout());

        JLabel label1 = new JLabel("Texto 1"); // Corrigido: uso de "=" e nome correto da classe JLabel
        JTextField textField1 = new JTextField(15); // Corrigido: nome da variável e uso de "="

        JPanel topPanel = new JPanel(); // Corrigido: uso de "=" e nome correto da classe JPanel
        topPanel.setLayout(new FlowLayout()); // Corrigido: método correto para definir layout
        topPanel.add(label1);
        topPanel.add(textField1);

        JButton button1 = new JButton("Botão 1"); // Corrigido: uso de "=" e nome correto da classe JButton
        JButton button2 = new JButton("Botão 2"); // Corrigido: nome correto da classe JButton
        JButton button3 = new JButton("Botão 3"); // Corrigido: nome correto da classe JButton

        JPanel buttonPanel = new JPanel(); // Corrigido: nome correto da classe JPanel
        buttonPanel.setLayout(new FlowLayout()); // Corrigido: nome correto do método
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        frame.add(topPanel, BorderLayout.NORTH); // Corrigido: nome correto da variável
        frame.add(buttonPanel, BorderLayout.CENTER); // Corrigido: nome correto do método

        frame.setVisible(true);
    }
}
