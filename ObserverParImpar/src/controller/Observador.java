package controller;

public class Observador implements IObservador, IGeradorNumeroAleat {

	@Override
	public void aleatorio() {
		System.out.println("Número gerado");	
	}
	
	public void aleatorioPar() {
		System.out.println("Número gerado é par");
	}
	
	public void aleatorioImpar() {
		System.out.println("Número gerado é impar");
	}
	
	@Override
	public void update(String acao) {
		if (acao.equals("par")) {
			aleatorioPar();
		}
		if (acao.equals("impar")) {
			aleatorioImpar();
		}
	}

	
}
