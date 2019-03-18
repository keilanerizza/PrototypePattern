package prototype;

public class Jeans extends Calca{

	public Jeans(){
		tipo = "jeans";
	}
	
	@Override
	public void criarModelo() {
		System.out.println("Calça jeans sendo criada...");
		
	}

}
