package ale.exemplos.Banquinho2.Transacoes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	Scanner scan = new Scanner(System.in);
	
	String agencia, numAgencia, nomeCliente, senha;
	Float saldo = 0.0f;
	List<Extrato> transacoes = new ArrayList<>();
	
	public Conta(String agencia, String numAgencia, String nomeCliente, String senha) {
		this.agencia = agencia;
		this.numAgencia = numAgencia;
		this.nomeCliente = nomeCliente;
		this.senha = senha;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public boolean verificarSenha(String input) {
		return this.senha.equals(input);
	}
	
  	private void depositar(float valor) {
		saldo+=valor;
		transacoes.add(new Extrato("deposito",valor));
	}
	
	private void sacar(float valor) {
		saldo-=valor;
		transacoes.add(new Extrato("saque",valor));
	}
	
	private void extrato() {
		System.out.println("\n====== Extrato =======");
		for(Extrato item:transacoes) {
			if(item.tipo=="deposito") {
				System.out.println("+R$"+item.valor);
			} else {
				System.out.println("-R$"+item.valor);
			}
		}
		System.out.println("\nSaldo: "+saldo);
		System.out.println("======================");
	}
	
	public void movimentar() {
		boolean usando = true;	
		while(usando) {
			System.out.println("\n[1]Depositar");
			System.out.println("[2]Sacar");
			System.out.println("[3]Extrato");
			System.out.println("[0]Voltar");
			System.out.print(">> ");
			int op = scan.nextInt();
			
			if(op==1) {
				System.out.print("\nInsira valor do depósito: ");
				float val = scan.nextFloat();
				depositar(val);
			} else if(op==2) {
				System.out.print("\nInsira valor do saque: ");
				float val = scan.nextFloat();
				sacar(val);
			} else if(op==3) {
				extrato();
			} else {
				usando = false;
			}
		}
	}
}
