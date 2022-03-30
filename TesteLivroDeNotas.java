import static javax.swing.JOptionPane.showInputDialog;
import javax.swing.JOptionPane;

import static java.lang.Integer.parseInt;
public class TesteLivroDeNotas {
    public static void main(String[] args) {

        String nomeDaDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina");
        //variável de referência
        LivroDeNotas livroDeNotas;

        //um objeto sendo construído
        livroDeNotas = new LivroDeNotas();

        livroDeNotas.exibirMensagem(nomeDaDisciplina);



    }
}
