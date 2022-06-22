package controller;

public class Observador implements IObservador, IGeradorNumeroAleat {

	@Override
	public void aleatorio() {
		System.out.println("N�mero gerado");	
	}
	
	public void aleatorioPar() {
		System.out.println("N�mero gerado � par");
	}
	
	public void aleatorioImpar() {
		System.out.println("N�mero gerado � impar");
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
