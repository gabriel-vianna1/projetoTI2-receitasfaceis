package model;

public class ModoDePreparo {
    private int id;
    private int idReceita;
    private int passo;
    private String descricao;
    
    public ModoDePreparo() {
        id = -1;
        idReceita = -1;
        passo = -1;
        descricao = "";
    }
    
    public ModoDePreparo(int id, int idReceita, int passo, String descricao) {
        setId(id);
        setIdReceita(idReceita);
        setPasso(passo);
        setDescricao(descricao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdReceita() {
        return idReceita;
    }
    
    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public int getPasso() {
        return passo;
    }

    public void setPasso(int passo) {
        this.passo = passo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Modo de Preparo [id=" + id + ", idReceita=" + idReceita + ", passo=" + passo + ", descricao=" + descricao + "]";
    }
}

