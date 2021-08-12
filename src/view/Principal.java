package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController vet = new OperacoesController();
		vet.percorreVetor1000();
        vet.percorreVetor10000();
        vet.percorreVetor100000();

	}
	
	

}
