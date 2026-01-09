import javax.swing.*;
import java.io.*;
public class Metodos {
    public Acidentes[] GravaAcidentes(Acidentes[] acidentes, int quantidade) throws IOException{
        int i; String fileName = "Acidentes.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        for (i=0;i<quantidade; i++){
            acidentes[i] = new Acidentes();
        }
        for (i=0; i<quantidade; i++){
            acidentes[i].codigoCid = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            gravar.write(Integer.toString(acidentes[i].codigoCid));
            gravar.newLine();
            
            acidentes[i].nomeCid = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            gravar.write(acidentes[i].nomeCid);
            gravar.newLine();
            
            acidentes[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes na cidade: "));
            gravar.write(Integer.toString(acidentes[i].qtdAcidentes));
            gravar.newLine();
        }
        
        JOptionPane.showMessageDialog(null,"Gravação Concluída.");
        gravar.close();
        return acidentes;
    }
    
    public void QuantidadeAcidentes(Acidentes[] acidentes, int quantidade) throws IOException{
        int i; String fileName = "Acidentes.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        int soma = 0;
        for (i=0; i<quantidade; i++){
            acidentes[i] = new Acidentes();
        }
        for (i=0; i<quantidade; i++){
            acidentes[i].codigoCid = Integer.parseInt(ler.readLine());
            acidentes[i].nomeCid = ler.readLine();
            acidentes[i].qtdAcidentes = Integer.parseInt(ler.readLine());
        }
        for(i=0; i<quantidade; i++){
            if (acidentes[i].qtdAcidentes>100 && acidentes[i].qtdAcidentes<500){
                soma+=acidentes[i].qtdAcidentes;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de acidentes foi: " +soma);
    }
    
    public void EstatisticasAcidentes(Acidentes[] acidentes, int quantidade) throws IOException{
        int i, menor, maior; String fileName = "Acidentes.txt";
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        for (i=0; i<quantidade; i++){
            acidentes[i] = new Acidentes();
        }
        for (i=0; i<quantidade; i++){
            acidentes[i].codigoCid = Integer.parseInt(ler.readLine());
            acidentes[i].nomeCid = ler.readLine();
            acidentes[i].qtdAcidentes = Integer.parseInt(ler.readLine());
        }
        menor = acidentes[0].qtdAcidentes;
        maior = acidentes[0].qtdAcidentes;
        for (i=1; i<quantidade; i++){
            if (acidentes[i].qtdAcidentes < menor){
                menor = acidentes[i].qtdAcidentes;
            }
            if (acidentes[i].qtdAcidentes> maior){
                maior = acidentes[i].qtdAcidentes;
            }
        }
        JOptionPane.showMessageDialog(null, "O menor número é: " +menor);
        JOptionPane.showMessageDialog(null, "O maior número é: " +maior);
        ler.close();
    }
    
    public void AcimaMedia(Acidentes[] acidentes, int quantidade) throws IOException{
        int i; String fileName = "Acidentes.txt";
        float media=0;
        BufferedReader ler = new BufferedReader(new FileReader(fileName));
        for (i=0; i<quantidade; i++){
            acidentes[i] = new Acidentes();
        }
        for (i=0; i<quantidade; i++){
            acidentes[i].codigoCid = Integer.parseInt(ler.readLine());
            acidentes[i].nomeCid = ler.readLine();
            acidentes[i].qtdAcidentes = Integer.parseInt(ler.readLine());
            media += acidentes[i].qtdAcidentes;
        }
        media = media/quantidade;
        for (i=0; i<quantidade; i++){
            if (acidentes[i].qtdAcidentes>media){
                JOptionPane.showMessageDialog(null, "A cidade '" + acidentes[i].nomeCid + "' teve " + acidentes[i].qtdAcidentes + " acidentes, que é superior à média de " + media);
            }
        }
        ler.close();
    }
}
