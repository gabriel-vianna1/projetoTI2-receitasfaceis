package main.java.model;

public class Receita {
	private int id;
	private String nome;
	private String tempo;
	private String dificuldade;
    private String imagem;
    private int idCategoria;
	
	public Receita() {
		id = -1;
		nome = "";
		tempo = "";
        dificuldade = "";
        imagem = "";
        idCategoria = -1;
	}
	
	public Receita(int id, String nome, String tempo, String dificuldade, String imagem, int idCategoria) {
		setId(id);
		setNome(nome);
		setTempo(tempo);
        setDificuldade(dificuldade);
        setImagem(imagem);
        setIdCategoria(idCategoria);
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

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }   

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

	@Override
	public String toString() {
		return "Receita [id=" + id + ", nome=" + nome + ", tempo=" + tempo + ", dificuldade=" + dificuldade + ", imagem=" + imagem + ", idCategoria=" + idCategoria + "]";
	}	
}