package model;

public class ReceitaIngrediente {
    private int id;
    private int idReceita;
    private int idIngrediente;
    private String quantidade;
    
    public ReceitaIngrediente() {
        id = -1;
        idReceita = -1;
        idIngrediente = -1;
        quantidade = "";
    }
    
    public ReceitaIngrediente(int id, int idReceita, int idIngrediente, String quantidade) {
        setId(id);
        setIdReceita(idReceita);   
        setIdIngrediente(idIngrediente);
        setQuantidade(quantidade);
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

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Receita Ingrediente [id=" + id + ", idReceita=" + idReceita + ", idIngrediente=" + idIngrediente + ", quantidade=" + quantidade + "]";
    }
}
