import javax.swing.JOptionPane;
import java.io.*;
public class ClassePrincipal {
    public static void main(String[] args) throws IOException{
        int opc = 0, quantidadeAcidentes = 3;
        Acidentes[] acidentes = new Acidentes[quantidadeAcidentes];
        Metodos m = new Metodos();
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Menu Estatistica\nEstatisticas de acidentes em 2020.\n1 - Cadastro estatística.\n2 - Consulta por quantidade de acidentes.\n3 - Consulta por estatísticas de acidentes.\n4 - Acidentes acima da média das 10 cidades.\n9 - Fim."));
            switch (opc){
                case 1: acidentes = m.GravaAcidentes(acidentes, quantidadeAcidentes);
                        break;
                case 2: m.QuantidadeAcidentes(acidentes, quantidadeAcidentes);
                        break;
                case 3: m.EstatisticasAcidentes(acidentes, quantidadeAcidentes);
                        break;
                case 4: m.AcimaMedia(acidentes, quantidadeAcidentes);
                        break;
                case 9: JOptionPane.showMessageDialog(null, "Fim.");
                        break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida.");
            }
        }
    }
}
