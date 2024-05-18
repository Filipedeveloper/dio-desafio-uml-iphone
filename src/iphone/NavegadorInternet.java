package iphone;

public class NavegadorInternet extends Iphone{
	String nomeNavegador;
	
	public void exibirPagina(String enderecoWeb) {
		System.out.println("Acessando a página " + enderecoWeb);
	}
	public void adicionarNovaAba() {
		System.out.println("Aba adicionada");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

}
