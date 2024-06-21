public class UsuarioComum extends Usuario{
    private int idPublicacao;

    //Construtor
    public UsuarioComum(String nome, String telefone, String email, String cpf, Double valor, int renovacao,
            int idPublicacao) {
        super(nome, telefone, email, cpf, valor, renovacao);
        this.idPublicacao = idPublicacao;
    }

    public boolean validaEmprestimo();

    //Getters e Setters
    public int getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(int idPublicacao) {
        this.idPublicacao = idPublicacao;
    }    
    
}