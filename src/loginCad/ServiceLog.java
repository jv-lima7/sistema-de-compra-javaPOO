package loginCad;

import java.util.Scanner;

public class ServiceLog {
	int op;
    
    public void realizarLogin(Cadastro cad, Login lgn, Scanner sys){
		RedfSenha rdfSenha = new RedfSenha();
        System.out.print("\nDigite seu email: ");
		String logEmail = sys.nextLine();
		lgn.setLogEmail(logEmail);
		while(!lgn.getLogEmail().equals(cad.getCadEmail())){
			System.out.println("Email não correspondente a uma conta!");
		    System.out.print("\nDigite o email correspondente à sua conta: ");
			logEmail = sys.nextLine();
			lgn.setLogEmail(logEmail);
		}
		System.out.print("Digite sua senha: ");
		String logSenha = sys.nextLine();
		lgn.setLogSenha(logSenha);
		while(!lgn.getLogSenha().equals(cad.getCadSenha())) {
			System.out.println("Senha incorreta!");
			System.out.println("\n1 - Redefinir senha");
			System.out.print("2 - Digitar senha novamente");
			System.out.print("\nEscolha uma opção: ");
            op = sys.nextInt();
			sys.nextLine();
			if(op==1){
				rdfSenha.redefinirSenha(cad, lgn);
			} else if(op == 2) {
				System.out.print("\nDigite a senha novamente: ");
				logSenha = sys.nextLine();
				lgn.setLogSenha(logSenha);
			}
        }		 
    }
}
