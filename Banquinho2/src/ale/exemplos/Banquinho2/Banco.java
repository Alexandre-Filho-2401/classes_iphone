package ale.exemplos.Banquinho2;

import ale.exemplos.Banquinho2.Transacoes.Conta;
import java.util.Scanner;
import java.util.Random;

public class Banco {
	
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	static Conta user;
	
	public static void main(String[] args) {

		
		while(true) {
			
			System.out.println("\n[1]Cadastrar");
			System.out.println("[2]Acessar");
			System.out.println("[0]Sair");
			System.out.print(">> ");
			int op = scan.nextInt();
			
			switch(op) {
			
			case 1:
				user = Cadastrar();
				break;
				
			case 2:
				System.out.print("\nInsira senha: ");
				String senha = scan.next();
				if(user.verificarSenha(senha)) {
					user.movimentar();
				} else {
					System.out.println("\nAceesso negado");
				}
				break;
				
			case 0:
				System.exit(0);
				break;
				
			default:
				System.out.println("\nOpção inválida");
			}
		}
	}
	
	public static Conta Cadastrar() {
		
		System.out.print("Insira Nome: ");
		String nome = scan.next();		
		System.out.print("Insira Sbrenome: ");
		String sobrenome = scan.next();
		String nomeCompleto = nome+" "+sobrenome;
		
		String agen = "067-8";
		String numAgen = String.format("%04d", rand.nextInt(9999)+1);
		
		System.out.print("Crie uma senha: ");
		String senha = scan.next();
		
		return new Conta(agen,numAgen,nomeCompleto,senha);
	}

}