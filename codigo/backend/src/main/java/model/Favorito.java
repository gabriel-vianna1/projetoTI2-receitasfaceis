package model;

public class Favorito {
    private int id;
    private int idUsuario;
    private int idReceita;
    
    public Favorito() {
        id = -1;
        idUsuario = -1;
        idReceita = -1;
    }
    
    public Favorito(int id, int idUsuario, int idReceita) {
        setId(id);
        setIdUsuario(idUsuario);
        setIdReceita(idReceita);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    @Override
    public String toString() {
        return "Favorito [id=" + id + ", idUsuario=" + idUsuario + ", idReceita=" + idReceita + "]";
    }
}
