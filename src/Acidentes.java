public class Acidentes {
    int codigoCid;
    String nomeCid;
    int qtdAcidentes;
    
    //construtor
    Acidentes(){
        this(0,"",0);
    }
    
    Acidentes(int codigo, String nome, int acidentes){
        codigoCid = codigo;
        nomeCid = nome;
        qtdAcidentes = acidentes;
    }
}
