package sistemacompra;

import java.util.Scanner;
import loginCad.Cadastro;
import loginCad.Login;
import loginCad.ServiceCad;
import loginCad.ServiceLog;

public class SistemaCompra {

	public static void main(String[] args) {
		Scanner sys = new Scanner(System.in);
		Cadastro cad = new Cadastro();
		Estoque estq = new Estoque();
		Login lgn = new Login();
		ServiceCad srvCad = new ServiceCad();
		ServiceLog srvLog = new ServiceLog();
		
		System.out.println("Olá, bem vindo ao sistema de compras online!");
		System.out.println("\n1 - Cadastrar-se agora");
		System.out.println("2 - Sair");
		System.out.print("\nSelecione uma opção: ");
		int op = sys.nextInt();
		sys.nextLine();
		
		while(op!=1 && op!=2) {
			System.out.println("Opção inválida! Tente novamente");
			System.out.println("\n1 - Cadastrar-se agora");
			System.out.println("2 - Sair");
			System.out.print("\nSelecione uma opção: ");
			op = sys.nextInt();
			sys.nextLine();
		}
		if(op==1) {
			op = srvCad.realizarCadastro(cad, sys);
			if(op==1) {
				srvLog.realizarLogin(cad, lgn, sys);
				estq.exibirEstoque();
			} else if(op==2) {
				System.out.println("\nEncerrando programa...");
				System.out.println("Programa encerrado.");
			}	
		} else if(op==2) {
			System.out.println("\nEncerrando programa...");
			System.out.println("Programa encerrado.");
		}
	sys.close();
	}
}