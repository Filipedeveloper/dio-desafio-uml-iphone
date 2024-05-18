package iphone;

public class ReprodutorMusical extends Iphone{
	
	String musica;
	boolean pouse = true;
	
	public void tocarMusica(String musica) {
		System.out.println("Tocando musica");
		pouse = true;
	}
	
	public void pouse() {
		String resp = (pouse == false) ? "Musica parada" : "Musica no play";
		System.out.println(resp);
		
	}
	
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	}
	

}
