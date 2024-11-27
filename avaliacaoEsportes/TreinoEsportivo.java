package avaliacaoEsportes;

public abstract class TreinoEsportivo {
	protected String local;
	protected String instrutor;
	protected String horario;
	
	public TreinoEsportivo(String local, String instrutor, String horario) {
		this.local = local;
		this.instrutor = instrutor;
		this.horario = horario;
	
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
}
