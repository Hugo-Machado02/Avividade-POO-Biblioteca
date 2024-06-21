import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> catalogoLivros = new ArrayList<Livro>();
    private ArrayList<Artigo> catalogoArtigos = new ArrayList<Artigo>();
    private ArrayList<Tese> catalogoTese = new ArrayList<Tese>();

    
    //Construtor
    public Biblioteca(String nome, String endereco, ArrayList<Livro> catalogoLivros, ArrayList<Artigo> catalogoArtigos,
            ArrayList<Tese> catalogoTese) {
        this.nome = nome;
        this.endereco = endereco;
        this.catalogoLivros = catalogoLivros;
        this.catalogoArtigos = catalogoArtigos;
        this.catalogoTese = catalogoTese;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Livro> getCatalogoLivros() {
        return catalogoLivros;
    }
    public void setCatalogoLivros(ArrayList<Livro> catalogoLivros) {
        this.catalogoLivros = catalogoLivros;
    }
    public ArrayList<Artigo> getCatalogoArtigos() {
        return catalogoArtigos;
    }
    public void setCatalogoArtigos(ArrayList<Artigo> catalogoArtigos) {
        this.catalogoArtigos = catalogoArtigos;
    }
    public ArrayList<Tese> getCatalogoTese() {
        return catalogoTese;
    }
    public void setCatalogoTese(ArrayList<Tese> catalogoTese) {
        this.catalogoTese = catalogoTese;
    }

}