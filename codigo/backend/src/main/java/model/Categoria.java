package model;

public class Categoria {
    private int id;
    private String nome;
    
    public Categoria() {
        id = -1;
        nome = "";
    }
    
    public Categoria(int id, String nome) {
        setId(id);
        setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nome=" + nome + "]";
    }
}
