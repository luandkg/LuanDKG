package Main;

import LuanDKG.Lista;
import LuanDKG.LuanDKG;
import LuanDKG.Objeto;
import LuanDKG.Pacote;

public class Main {

	public static void main(String[] args) {

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("---------------------------- Biblioteca LuanDKG 1.0 ---------------------------- ");

		System.out.println("");

		
		LuanDKG Arquivo = new LuanDKG();

		Pacote Mundo = Arquivo.UnicoPacote("Mundo");

		Pacote Pessoas = Mundo.UnicoPacote("Pessoas");
		
		Objeto P1 = Pessoas.CriarObjeto("Pessoa");
		P1.Identifique("ID",1);
		P1.Identifique("Nome","Aline Freitas");
		P1.Identifique("Altura",1.70);

		Objeto P2 = Pessoas.CriarObjeto("Pessoa");
		P2.Identifique("ID",2);
		P2.Identifique("Nome","Samuel Alencar");
		P2.Identifique("Altura",1.90);

		Lista L1 = Pessoas.CriarLista("Tipos");
			
		L1.AdicionarItem("Amarelo");
		L1.AdicionarItem("Verde");
		L1.AdicionarItem("Vermelho");
		L1.AdicionarItem("Azul");
		L1.AdicionarItem("Preto");
		L1.AdicionarItem("Branco");
		L1.AdicionarItem("Cinza");

		
		System.out.println(Arquivo.GerarString());

		
	
	}

}
