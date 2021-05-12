package Interface;

public class cachorro implements Animal {

	@Override
	public void nome() {
		System.out.println(" O nome do cachoro é: Layca");
		
	}

	@Override
	public void idade() {
		System.out.println(" Ele tem 12 anos");
		
	}

	@Override
	public void som() {
		System.out.println(" o som que ele emite é ladra");
		
	}

	@Override
	public void corre() {
		System.out.println(" ele corre");
		
	}

}
