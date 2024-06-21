public class Tese extends Publicacao{
    private Autor autor;
    private int numero_paginas;
    private String resumo;
    private String data_defesa;
    private String instituição;

    //Construtor
    public Tese(int id, String tituloPublicacao, String dataPubliacao, boolean statusEmpréstimo, double valorMulta,
            Autor autor, int numero_paginas, String resumo, String data_defesa, String instituição) {
        super(id, tituloPublicacao, dataPubliacao, statusEmpréstimo, valorMulta);
        this.autor = autor;
        this.numero_paginas = numero_paginas;
        this.resumo = resumo;
        this.data_defesa = data_defesa;
        this.instituição = instituição;
    }

    //Getters e Setters
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getNumero_paginas() {
        return numero_paginas;
    }
    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getData_defesa() {
        return data_defesa;
    }
    public void setData_defesa(String data_defesa) {
        this.data_defesa = data_defesa;
    }
    public String getInstituição() {
        return instituição;
    }
    public void setInstituição(String instituição) {
        this.instituição = instituição;
    }

    //Construtor
    
}
