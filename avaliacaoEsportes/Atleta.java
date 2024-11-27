package avaliacaoEsportes;

public class Atleta {
	private String nome;
	private int idade;
	protected String modalidade;
	protected Niveis progresso;
	
	public Atleta(String nome, int idade, String modalidade, Niveis progresso) {
		this.nome = nome;
		this.idade = idade;
		this.modalidade = modalidade;
		this.progresso = progresso;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public Niveis getProgresso() {
		return progresso;
	}
	
	public void setProgresso(Niveis progresso) {
		this.progresso = progresso;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: " + nome + ", Idade: " + idade + ", Modalidade: " + modalidade + " , Progresso: " + progresso);
	}
	
}
