package Interface;

public class Preguica implements Animal {

	@Override
	public void nome() {
		System.out.println(" O nome do cachoro �: Bob");
		
	}

	@Override
	public void idade() {
		System.out.println(" tem 2 anos ");
		
	}

	@Override
	public void som() {
		System.out.println(" O som que ele emite � haaaa");
		
	}

	@Override
	public void corre() {
		System.out.println(" Sobe arvores");
		
	}

}
