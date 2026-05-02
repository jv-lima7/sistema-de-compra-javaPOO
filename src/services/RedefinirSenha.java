package services;

import java.util.Scanner;

public class RedefinirSenha {
    Scanner sys = new Scanner(System.in);

    public void redefinirSenha(Cadastro cadastro, Login login){
        System.out.print("Digite seu email: ");
	    String logEmail = sys.nextLine();
	    while(!logEmail.equals(cadastro.getCadEmail())) {
		    System.out.println("O email digitado não corresponde ao cadastrado à sua conta!");
		    System.out.print("\nDigite o email cadastrado à sua conta: ");
		    logEmail = sys.nextLine();
	    }
		System.out.print("Digite seu CPF: ");
		String logCpf = sys.nextLine();
		login.setLogCpf(logCpf);
		while(!login.getLogCpf().equals(cadastro.getCadCpf())) {
	        System.out.println("O CPF digitado não condiz com o cadastrado na conta!");
		    System.out.print("\nDigite o CPF cadastrado à sua conta: ");
			logCpf = sys.nextLine();
			login.setLogCpf(logCpf);
		}
		System.out.print("Digite sua nova senha: ");
		String logSenha = sys.nextLine();
		cadastro.setCadSenha(logSenha);
		login.setLogSenha(logSenha);
		System.out.print("Confirme sua nova senha: ");
		String confirmSenha = sys.nextLine();
		cadastro.setConfirmSenha(confirmSenha);
		login.setLogConfirmSenha(confirmSenha);
		while (!login.getLogSenha().equals(login.getLogConfirmSenha())) {
			System.out.println("\nAs senhas não coincidem! Tente novamente.");
			System.out.print("\nDigite uma senha: ");
			String senha = sys.nextLine();
			cadastro.setCadSenha(senha);
			login.setLogSenha(senha);
							
			System.out.print("Confirme sua senha: ");
			confirmSenha = sys.nextLine();
			cadastro.setConfirmSenha(confirmSenha);
			login.setLogConfirmSenha(confirmSenha);
        }
		System.out.println("\n----------LOGIN----------");
		System.out.print("Digite seu email: ");
		logEmail = sys.nextLine();
		while(!logEmail.equals(login.getLogEmail())) {
			System.out.println("\nEmail incorreto!");
			System.out.print("Digite seu email novamente: ");
			logEmail = sys.nextLine();
		}
		System.out.print("Digite sua senha: ");
		logSenha = sys.nextLine();
		while(!logSenha.equals(login.getLogSenha())) {
			System.out.println("Senha inválida!");
			System.out.println("Sua senha foi alterada há pouco tempo");
			System.out.print("\nDigite a senha novamente: ");
			logSenha = sys.nextLine();
		}
    }  
}
