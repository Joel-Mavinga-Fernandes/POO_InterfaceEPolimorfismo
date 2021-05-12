package Interface;

public class cavalo implements Animal {

	@Override
	public void nome() {
		System.out.println(" O nome do cachoro é: bob");
		
	}

	@Override
	public void idade() {
		System.out.println(" Tem 4 anos de idade");
		
	}

	@Override
	public void som() {
		System.out.println(" O som que ele emite relinchar");
		
	}

	@Override
	public void corre() {
		System.out.println("ele corre");
		
	}

}
