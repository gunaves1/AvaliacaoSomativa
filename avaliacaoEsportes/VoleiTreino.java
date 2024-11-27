package avaliacaoEsportes;

public class VoleiTreino extends TreinoEsportivo{

	private String manguito;
	private String tenis;
	private String joelheira;
	
	public VoleiTreino(String local, String instrutor, String horario, String manguito, String tenis,
			String joelheira) {
		super(local, instrutor, horario);
		this.manguito = manguito;
		this.tenis = tenis;
		this.joelheira = joelheira;
	}

	public String getManguito() {
		return manguito;
	}

	public void setManguito(String manguito) {
		this.manguito = manguito;
	}

	public String getTenis() {
		return tenis;
	}

	public void setTenis(String tenis) {
		this.tenis = tenis;
	}

	public String getJoelheira() {
		return joelheira;
	}

	public void setJoelheira(String joelheira) {
		this.joelheira = joelheira;
	}
}
