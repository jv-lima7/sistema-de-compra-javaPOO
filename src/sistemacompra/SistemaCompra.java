package sistemacompra;

import java.util.Scanner;
import services.Cadastro;
import services.Login;
import services.ServiceCadastro;
import services.ServiceLogin;

public class SistemaCompra {

	public static void main(String[] args) {
		Scanner sys = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		Estoque estoque = new Estoque();
		Login login = new Login();
		ServiceCadastro serviceCad = new ServiceCadastro();
		ServiceLogin serviceLogin = new ServiceLogin();

		System.out.println("Olá, bem vindo ao sistema de compras online!");
		System.out.println("\n1 - Cadastrar-se agora");
		System.out.println("2 - Encerrar programa");
		System.out.print("\nEscolha uma opção: ");
		int op = sys.nextInt();
		sys.nextLine();

		while(op!=1 && op!=2) {
			System.out.println("Opção inválida! Tente novamente");
			System.out.println("\n1 - Cadastrar-se agora");
			System.out.println("2 - Encerrar programa");
			System.out.print("\nEscolha uma opção: ");
			op = sys.nextInt();
			sys.nextLine();
		}
		if(op==1) {
			op = serviceCad.realizarCadastro(cadastro, sys);
			if(op==1) {
				serviceLogin.realizarLogin(cadastro, login, sys);
				estoque.exibirEstoque();
			} else {
				System.out.println("\nEncerrando programa...");
				System.out.println("Programa encerrado.");
			}
		} else {
			System.out.println("\nEncerrando programa...");
			System.out.println("Programa encerrado.");
		}
	sys.close();
	}
}