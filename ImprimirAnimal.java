package br.com.generation.polimorfismo2;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
	TestaAnimal t = new TestaAnimal();	
	
	t.fazerAnimalComer(new Cachorro());
	t.fazerAnimalComer(new Cavalo());
	
	
	
	

	}

}
