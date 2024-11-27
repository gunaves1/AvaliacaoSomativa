package avaliacaoEsportes;

public class FutebolTreino extends TreinoEsportivo{
	
	private String bola;
	private String chuteira;
	private String caneleira;
	
	public FutebolTreino(String local, String instrutor, String horario, String bola, String chuteira,String caneleira) {
		super(local, instrutor, horario);
		this.bola = bola;
		this.chuteira = chuteira;
		this.caneleira = caneleira;
	}

	public String getBola() {
		return bola;
	}

	public void setBola(String bola) {
		this.bola = bola;
	}

	public String getChuteira() {
		return chuteira;
	}

	public void setChuteira(String chuteira) {
		this.chuteira = chuteira;
	}

	public String getCaneleira() {
		return caneleira;
	}

	public void setCaneleira(String caneleira) {
		this.caneleira = caneleira;
	}
	public void exibirInformacoes() {
		System.out.println("Local: " + local + ", Instrutor: " + instrutor + ", Horário: " + horario);
	}
}
