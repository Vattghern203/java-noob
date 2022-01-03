import java.util.ArrayList;

public class Anime {

    private String Nome;
   private int Lancamento, Episodios, Temporadas;

   public Anime(String n,int m,int q,int z) {
		Nome = n;
		Lancamento = m;
		Episodios = q;
		Temporadas = z;
	}

	public Anime() {
	}

    //get's e set's
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

    public int getEpisodios() {
        return Episodios;
    }

    public void setEpisodios(int Episodios) {
        this.Episodios = Episodios;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int Temporadas) {
        this.Temporadas = Temporadas;
    }

    //métodos:
    public void atual(){
		System.out.println("Anime atualizando semanalmente ...");
	}

	public static int attTemporada(int Temporada){
		return (Temporada+1);
	}

    public void showAnimeTV() {
        System.out.println("Nome: " + getNome() + "\nAno de lancamento: " + getLancamento() + "\nNuméro de episodios: " + getEpisodios() + "\nNúmero de temporadas: " + getTemporadas());
    }

	public static void main(String[] args) {
		Anime a1 = new Anime();
		a1.setNome("Hunter x Hunter");
		a1.setLancamento(2011);
		a1.setEpisodios(148);
		a1.setTemporadas(3);

        a1.showAnimeTV();
        System.out.println("Proxima temporada de " + a1.Nome + " : " + attTemporada(a1.Temporadas));

        Anime a2 = new Anime();
		a2.setNome("Shigatsu wa kimi no uso");
		a2.setLancamento(2014);
		a2.setEpisodios(22);
		a2.setTemporadas(1);

        a2.showAnimeTV();

        Anime a3 = new Anime("Naruto Shipudden",2007,500,22);

        a3.showAnimeTV();

	}
}
