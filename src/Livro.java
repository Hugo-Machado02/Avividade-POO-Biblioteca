public class Livro extends Publicacao {
    private String isbn;
    private Autor autor;
    private String Editora;
    private String numEducao;

    //Construtor
    public Livro(int id, String tituloPublicacao, String dataPubliacao, boolean statusEmpréstimo, String isbn,
            Autor autor, String editora, String numEducao, double valorMulta) {
        super(id, tituloPublicacao, dataPubliacao, statusEmpréstimo, valorMulta);
        this.isbn = isbn;
        this.autor = autor;
        Editora = editora;
        this.numEducao = numEducao;
    }

    //Getters e Setters
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return Editora;
    }
    public void setEditora(String editora) {
        Editora = editora;
    }
    public String getNumEducao() {
        return numEducao;
    }
    public void setNumEducao(String numEducao) {
        this.numEducao = numEducao;
    }

}
