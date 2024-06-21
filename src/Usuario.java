public class Usuario {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Double valorMulta;
    private int renovacao;

    //Constructor
    public Usuario(String nome, String telefone, String email, String cpf, Double valor, int renovacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.valorMulta = valor;
        this.renovacao = renovacao;
    }

    //Funções
    public boolean validaEmprestimo;

   //Getters e Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValor() {
        return valorMulta;
    }

    public void setValor(Double valor) {
        this.valorMulta = valor;
    }

    public int getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    
}

