public class Publicacao {
    protected int id;
    private String tituloPublicacao;
    private String dataPubliacao;
    private boolean statusEmpréstimo;
    private double valorMulta;

    

    public Publicacao(int id, String tituloPublicacao, String dataPubliacao, boolean statusEmpréstimo, double valorMulta) {
        this.id = id;
        this.tituloPublicacao = tituloPublicacao;
        this.dataPubliacao = dataPubliacao;
        this.statusEmpréstimo = statusEmpréstimo;
        this.valorMulta = valorMulta;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloPublicacao() {
        return tituloPublicacao;
    }

    public void setTituloPublicacao(String tituloPublicacao) {
        this.tituloPublicacao = tituloPublicacao;
    }

    public String getDataPubliacao() {
        return dataPubliacao;
    }

    public void setDataPubliacao(String dataPubliacao) {
        this.dataPubliacao = dataPubliacao;
    }

    public boolean isStatusEmpréstimo() {
        return statusEmpréstimo;
    }

    public void setStatusEmpréstimo(boolean statusEmpréstimo) {
        this.statusEmpréstimo = statusEmpréstimo;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    
}