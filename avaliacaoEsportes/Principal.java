package avaliacaoEsportes;

public class Principal {

	public static void main(String[] args) {
		Atleta atleta1 = new Atleta("João", 20, "Futebol", Niveis.INICIANTE);
		FutebolTreino futebol = new FutebolTreino("Ginásio Paulo", "Paulo Baiana", "15:00", "Sim", "", "");
		
		
		
		atleta1.exibirInformacoes();
		futebol.exibirInformacoes();
		
	}

}
