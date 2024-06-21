public class Autor {
    private String nome;
    private String titulacao;

    //Construtor
    public Autor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }


}
