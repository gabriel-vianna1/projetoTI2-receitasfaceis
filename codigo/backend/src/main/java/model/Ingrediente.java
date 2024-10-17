package main.java.model;

public class Ingrediente {
    private int id;
    private String nome;
    
    public Ingrediente() {
        id = -1;
        nome = "";
    }
    
    public Ingrediente(int id, String nome) {
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
        return "Ingrediente [id=" + id + ", nome=" + nome + "]";
    }
}
