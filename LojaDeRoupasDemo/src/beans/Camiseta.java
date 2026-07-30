package beans;

public class Camiseta extends Produto {

    private String tipoManga;

    public Camiseta() {
        super();
    }

    public Camiseta(int id, String nome, double preco, int estoque, String tipoManga) {
        super(id, nome, preco, estoque);
        this.tipoManga = tipoManga;
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }

    public double calcularPreco() {
        return getPreco();
    }

    public String toString() {
        return super.toString() +
               "\nTipo de Manga: " + tipoManga;
    }

}