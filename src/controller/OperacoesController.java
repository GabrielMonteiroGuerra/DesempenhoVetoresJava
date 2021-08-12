package controller;

public class OperacoesController {
	
	 public OperacoesController() {
			super();
		}
	 
	 public void percorreVetor1000() {
			int [] vetor = new int [1000];
			double TempoInicial = System.nanoTime();
			for (int count : vetor){
				}
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial;
		 TempoTotal = TempoTotal / Math.pow(10, 9);
	   	 System.out.println("Vetor [1000] posições: "+TempoTotal+"s.");
			
			}
	
	public void percorreVetor10000() {
		int [] vetor = new int [10000];
		double TempoInicial = System.nanoTime();
		for (int count : vetor){
			}
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
	 TempoTotal = TempoTotal / Math.pow(10, 9);
   	 System.out.println("Vetor [10000] posições: "+TempoTotal+"s.");
		
		}
	
	public void percorreVetor100000() {
		int [] vetor = new int [100000];
		double TempoInicial = System.nanoTime();
		for (int count : vetor){
			}
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
	 TempoTotal = TempoTotal / Math.pow(10, 9);
   	 System.out.println("Vetor [100000] posições: "+TempoTotal+"s.");
		
		}

	
	
	}


