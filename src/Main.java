
public class Main {

	public static void main(String[] args) {
		
		Agencia ag = new Agencia();
		ag.cadastrar(new Cantor("Jhonny Ferreira"));
		
		Agencia ag1 = new Agencia();
		ag1.cadastrar(new Cantor("Jhonny ferreira 2"));
	}

}
