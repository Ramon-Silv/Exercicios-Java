package festaAniversario;

class Festa extends festaAniversario {
	public void main(String[] args) {
		Festa festa = new Festa();

		festa.setNomeAniversariante("Karlos");
		festa.setIdade(21);
		festa.setLocal("São Paulo");
		festa.setDia("04/07/2023");
		festa.setHorario("16:00");
		festa.status();
	}
}