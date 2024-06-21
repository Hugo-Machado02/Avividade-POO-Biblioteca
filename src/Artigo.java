import java.util.ArrayList;

public class Artigo extends Publicacao{
    private ArrayList<Autor> autores = new ArrayList<Autor>();
    private ArrayList<String> publicacoesReferencia = new ArrayList<String>();

    //Construtor
    public Artigo(int id, String tituloPublicacao, String dataPubliacao, boolean statusEmpréstimo, double valorMulta,
            ArrayList<Autor> autores, ArrayList<String> publicacoesReferencia) {
        super(id, tituloPublicacao, dataPubliacao, statusEmpréstimo, valorMulta);
        this.autores = autores;
        this.publicacoesReferencia = publicacoesReferencia;
    }
    

    //Getters e Setters
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    public ArrayList<String> getPublicacoesReferencia() {
        return publicacoesReferencia;
    }
    public void setPublicacoesReferencia(ArrayList<String> publicacoesReferencia) {
        this.publicacoesReferencia = publicacoesReferencia;
    }
}