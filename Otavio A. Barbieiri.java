import java.util.ArrayList;

public class Manga {

   private String Nome;
   private int Lancamento, Capitulos, Volumes;

   public Manga(String n, int l, int c, int v) {
		Nome = n;
		Lancamento = l;
		Capitulos = c;
		Volumes = v;
	}

	public Manga() {
	}

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getLancamento() {
        return Lancamento;
    }

    public void setLancamento(int Lancamento) {
        this.Lancamento = Lancamento;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int Capitulos) {
        this.Capitulos = Capitulos;
    }

    public int getVolumes() {
        return Volumes;
    }

    public void setVolumes(int Volumes) {
        this.Volumes = Volumes;
    }

    public void atual(){
		System.out.println("Manga atualizando mensalmente ...");
	}

	public static int attVolume(int Volume){
		return (Volume + 1);
	}

    public void showMangaData() {
        System.out.println("Nome: " + getNome() + "\nAno de lancamento: " + getLancamento() + "\nNuméro de Capitulos: " + getCapitulos() + "\nNúmero de Volumes: " + getVolumes());
    }

	public static void main(String[] args) {
		Manga a1 = new Manga();
		a1.setNome("Yotsubato");
		a1.setLancamento(2003);
		a1.setCapitulos(108);
		a1.setVolumes(15);

        a1.showMangaData();
        System.out.println("Proximo Volume " + a1.Nome + " : " + attVolumes(a1.Volumes));

        Manga a2 = new Manga();
		a2.setNome("Spy x Family");
		a2.setLancamento(2019);
		a2.setCapitulos(47);
		a2.setVolumes(7);

        a2.showMangaData();

        Manga a3 = new Manga("Komi-san wa, Comyushou desu",2015,307,19);

        a3.showMangaData();

	}
}
