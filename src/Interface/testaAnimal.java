package Interface;

public class testaAnimal {

	public static void main(String[] args) {
		
		cachorro cac = new cachorro();
		cavalo cav = new cavalo ();
		Preguica preg = new Preguica();
		
		System.out.println("Dados do cachorro: ");
		cac.nome();
		cac.idade();
		cac.som();
		cac.corre();
		System.out.println();
		System.out.println("Dados do cavalo: ");
		cav.nome();
		cav.idade();
		cav.som();
		cav.corre();
		
		System.out.println();
		System.out.println("Dados do Preguiça: ");
		preg.nome();
		preg.idade();
		preg.som();
		preg.corre();

	}

}
