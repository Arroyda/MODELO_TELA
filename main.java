import javax.swing.*; // Importa as classes da biblioteca Swing para criar interfaces gráficas
import java.awt.*; // Importa classes do pacote AWT para layouts e componentes gráficos

public class main { // Classe principal do programa, que deve começar com letra maiúscula

    public static void main(String[] args) {
        // Cria uma nova janela (frame) com o título "AWT Test"
        JFrame frame = new JFrame("AWT Test");

        // Define a operação padrão ao fechar a janela (neste caso, encerra o programa)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Define o tamanho da janela (largura: 490, altura: 292)
        frame.setSize(490, 292);
        
        // Define o layout da janela como BorderLayout (divide a janela em cinco áreas)
        frame.setLayout(new BorderLayout());

        // Cria um rótulo (label) com o texto "Label 1"
        JLabel label1 = new JLabel("Label 1");
        
        // Cria um campo de texto (text field) com uma largura de 15 colunas
        JTextField textField1 = new JTextField(15);

        // Cria um painel (panel) para agrupar os componentes superiores
        JPanel topPanel = new JPanel();
        
        // Define o layout do painel superior como FlowLayout (organiza componentes em linha)
        topPanel.setLayout(new FlowLayout());
        
        // Adiciona o rótulo e o campo de texto ao painel superior
        topPanel.add(label1);
        topPanel.add(textField1);

        // Cria três botões com texto correspondente
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Cria um painel para agrupar os botões
        JPanel buttonPanel = new JPanel();
        
        // Define o layout do painel de botões como FlowLayout
        buttonPanel.setLayout(new FlowLayout());
        
        // Adiciona os botões ao painel de botões
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Adiciona o painel superior à parte superior da janela
        frame.add(topPanel, BorderLayout.NORTH);
        
        // Adiciona o painel de botões ao centro da janela
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Torna a janela visível na tela
        frame.setVisible(true);
    }
}
