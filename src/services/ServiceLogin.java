package services;

import java.util.Scanner;

public class ServiceLogin {
    int op;
    public void realizarLogin(Cadastro cadastro, Login login, Scanner sys){
        RedefinirSenha rdfSenha = new RedefinirSenha();
        int countEmail = 0;

        System.out.print("\nDigite seu email: ");
        String logEmail = sys.nextLine();
        login.setLogEmail(logEmail);
        while(countEmail<3 && !login.getLogEmail().equals(cadastro.getCadEmail())){
            System.out.println("Email não correspondente à sua conta!");
            System.out.println("\nVocê possui mais "+(3-countEmail)+" tentativas de digitação do email até o programa reiniciar!");
            countEmail++;
            System.out.print("\nDigite o email correspondente à sua conta: ");
            logEmail = sys.nextLine();
            login.setLogEmail(logEmail);
            if (countEmail>=3 && !login.getLogEmail().equals(cadastro.getCadEmail())) {
                System.out.println("Você excedeu o limite de tentativas! Tente novamente mais tarde.");
                System.out.println("Encerrando programa...");
                System.out.println("Programa encerrado.");
                System.exit(0);
            }
        }
        System.out.print("Digite sua senha: ");
        String logSenha = sys.nextLine();
        login.setLogSenha(logSenha);
        while(!login.getLogSenha().equals(cadastro.getCadSenha())) {
            System.out.println("Senha incorreta!");
            System.out.println("\n1 - Redefinir senha");
            System.out.print("2 - Digitar senha novamente");
            System.out.print("\nEscolha uma opção: ");
            op = sys.nextInt();
            sys.nextLine();
            if(op==1){
                rdfSenha.redefinirSenha(cadastro, login);
            } else if(op == 2) {
                System.out.print("\nDigite a senha novamente: ");
                logSenha = sys.nextLine();
                login.setLogSenha(logSenha);
            }
        }
    }
}