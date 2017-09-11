package testeGitHub;

public class Teste {

	public static void main(String[] args) {
		Teste1 teste1 = new Teste1();
		teste1.setNome("Diego");
		teste1.setTelefone("3333-3333");
		print("Nome:" + teste1.getNome());
		print("Telefone:" + teste1.getTelefone());
	}
	
	public static void print(String str) {
		System.out.println(str + "teste");
	}

}
