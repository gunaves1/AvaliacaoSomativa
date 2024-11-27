package avaliacaoEsportes;

public class NatacaoTreino extends TreinoEsportivo{
	
	private String touca;
	private String oculos;
	private String roupadeBanho;
	
	public NatacaoTreino(String local, String instrutor, String horario, String touca, String oculos,
			String roupadeBanho) {
		super(local, instrutor, horario);
		this.touca = touca;
		this.oculos = oculos;
		this.roupadeBanho = roupadeBanho;
	}

	public String getTouca() {
		return touca;
	}

	public void setTouca(String touca) {
		this.touca = touca;
	}

	public String getOculos() {
		return oculos;
	}

	public void setOculos(String oculos) {
		this.oculos = oculos;
	}

	public String getRoupadeBanho() {
		return roupadeBanho;
	}

	public void setRoupadeBanho(String roupadeBanho) {
		this.roupadeBanho = roupadeBanho;
	}
	
}
