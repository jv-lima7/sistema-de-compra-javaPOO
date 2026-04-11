package loginCad;

import java.util.Scanner;

public class RedfSenha {
    Scanner sys = new Scanner(System.in);

    public void redefinirSenha(Cadastro cad, Login lgn){
        System.out.print("Digite seu email: ");
	    String logEmail = sys.nextLine();
	    while(!logEmail.equals(cad.getCadEmail())) {
		    System.out.println("O email digitado não corresponde ao cadastrado à sua conta!");
		    System.out.print("\nDigite o email cadastrado à sua conta: ");
		    logEmail = sys.nextLine();
	    }
		System.out.print("Digite seu CPF: ");
		String logCpf = sys.nextLine();
		lgn.setLogCpf(logCpf);
		while(!lgn.getLogCpf().equals(cad.getCadCpf())) {
	        System.out.println("O CPF digitado não condiz com o cadastrado na conta!");
		    System.out.print("\nDigite o CPF cadastrado à sua conta: ");
			logCpf = sys.nextLine();
			lgn.setLogCpf(logCpf);
		}
		System.out.print("Digite sua nova senha: ");
		String logSenha = sys.nextLine();
		cad.setCadSenha(logSenha);
		lgn.setLogSenha(logSenha);
		System.out.print("Confirme sua nova senha: ");
		String confirmSenha = sys.nextLine();
		cad.setConfirmSenha(confirmSenha);
		lgn.setLogConfirmSenha(confirmSenha);
		while (!lgn.getLogSenha().equals(lgn.getLogConfirmSenha())) {
			System.out.println("\nAs senhas não coincidem! Tente novamente.");
			System.out.print("\nDigite uma senha: ");
			String senha = sys.nextLine();
			cad.setCadSenha(senha);
			lgn.setLogSenha(senha);
							
			System.out.print("Confirme sua senha: ");
			confirmSenha = sys.nextLine();
			cad.setConfirmSenha(confirmSenha);
			lgn.setLogConfirmSenha(confirmSenha);
        }
		System.out.println("\n----------LOGIN----------");
		System.out.print("Digite seu email: ");
		logEmail = sys.nextLine();
		while(logEmail!=(lgn.getLogEmail())) {
			System.out.println("\nEmail incorreto!");
			System.out.println("Digite seu email novamente: ");
			logEmail = sys.nextLine();
		}
		System.out.print("Digite sua senha: ");
		logSenha = sys.nextLine();
		while(!logSenha.equals(lgn.getLogSenha())) {
			System.out.println("Senha inválida!");
			System.out.println("Sua senha foi alterada há pouco tempo");
			System.out.print("\nDigite a senha novamente: ");
			logSenha = sys.nextLine();
		}
    }  
}
