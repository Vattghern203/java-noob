import java.util.ArrayList;

public class Oregairu {

    private String Nome, CabeloCor, OlhoCor, MesDeNascimento;    
    private int Idade, DiaDeNascimento;    

    public Oregairu(String N, String CC, String OC, String MN, int I,  DN) {    
            Nome = N;
            CabeloCor = CC;
            OlhoCor = OC;
            MesDeNascimento = MN;
            Idade = I;
            DiaDeNascimento = DN;
    }

    public Oregairu() {    
    }

    public String getNome() {    
        return Nome;
    }

    public void setNome(String Nome) {    
        this.Nome = Nome;
    }

    public String getCabeloCor() {    
        return CabeloCor;
    }

    public void setCabeloCor(String CabeloCor) {    
        this.CabeloCor = CabeloCor;
    }

    public String getOlhoCor() {    
        return OlhoCor;
    }

    public void setOlhoCor(String OlhoCor) {    
        this.OlhoCor = OlhoCor;
    }

        public String getMesDeNascimento() {
        return MesDeNascimento;
    }

    public void setMesDeNascimento(String MesDeNascimento) {    
        this.MesDeNascimento = MesDeNascimento;
    }

    public int getIdade() {    
        return Idade;
    }

    public void setIdade(int Idade){    
        this.Idade = Idade;
    }

    public int getDiaDeNascimento(){    
        return DiaDeNascimento;
    }

    public void setDiaDeNascimento(int    DiaDeNascimento){
        this.DiaDeNascimento = DiaDeNascimento;
    }

    public static int MaisUmAno(int Idade){    
        return (Idade + 1);
    }

    public void showCharData() {    
        System.out.println("Nome: " + getNome() + "\nIdade(em anos): " + getIdade() + "\nCor do Cabelo " + getCabeloCor() + "\nCor dos Olhos: " + getOlhoCor() + "\nDiaDeNascimento(em centimetros): " + getDiaDeNascimento() + "Mes de Nascimento: " + getMesDeNascimento());
    }

    public static void main(String[] args) {   
        Oregairu a1 = new Oregairu();
        a1.setNome("Yukinoshita Yukino");
        a1.setIdade(17);
        a1.setDiaDeNascimento(3);
        a1.setMesDeNascimento("Janeiro");
        a1.setCabeloCor("Preto");
        a1.setOlhoCor("Azuis");

        a1.showCharData();
        System.out.println("Um ano a partir de hoje" + a1.Idade + " : " + MaisUmAno(a1.Idade));

        Oregairu a2 = new Oregairu();
        a2.setNome("Yuigahama Yui");
        a2.setIdade(17);
        a2.setDiaDeNascimento(18);
        a2.setMesDeNascimento("Junho");
        a2.setCabeloCor("Laranja Claro");
        a2.setOlhoCor("Castanhos");

        a2.showCharData();

        Oregairu a3 = new Oregairu();
        a3.setNome("Isshiki Iroha");
        a3.setIdade(16);
        a3.setDiaDeNascimento(16);
        a3.setMesDeNascimento("Abril");
        a3.setCabeloCor("Linho");
        a3.setOlhoCor("Mel");

        a3.showCharData();
    }
}




