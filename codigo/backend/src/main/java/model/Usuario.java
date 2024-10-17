package model;

public class Usuario {
	private int id;
	private String nome;
	private String senha;
	private String email;
	
	public Usuario() {
		id = -1;
		nome = "";
		senha = "";
		email = "";
	}
	
	public Usuario(int id, String nome, String senha, String email) {
		setId(id);
		setNome(nome);
		setSenha(senha);
		setEmail(email);
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", senha=" + senha + ", email=" + email + "]";
	}	
}