package iphone;

import iphone.apps.*;

public class menu {
	
	static musicPlayer spotify = new musicPlayer();
	static browser google = new browser();
	static telefone Telefone = new telefone();
	
	public static void main(String[] args) {
		Telefone.discar();
		google.buscar();
		spotify.buscarMusica();
	}
}
// Foi bem de boa pra resolver, tipo.. era só isso mesmo?
// Não vi motivos pra usar interface ou algo mais complexo nesse caso