package loginCad;
import java.util.Scanner;
public class ServiceCad {

    public int realizarCadastro(Cadastro cad, Scanner sys) {
        String confirmSenha;
		
        System.out.print("\nDigite seu email: ");
		String email = sys.nextLine();
		cad.setCadEmail(email);
				
		System.out.print("Digite seu CPF: ");
		String cpf = sys.nextLine();
		cad.setCadCpf(cpf);
				
		System.out.print("Digite sua senha: ");
		String senha = sys.nextLine();
		cad.setCadSenha(senha);
				
		System.out.print("Confirme sua senha: ");
		confirmSenha = sys.nextLine();
		cad.setConfirmSenha(confirmSenha);

		while (!cad.getCadSenha().equals(cad.getConfirmSenha())) {
			System.out.println("\nAs senhas não coincidem! Tente novamente.");
			System.out.print("\nDigite uma senha: ");
			senha = sys.nextLine();
			cad.setCadSenha(senha);
				
			System.out.print("Confirme sua senha: ");
			confirmSenha = sys.nextLine();
			cad.setConfirmSenha(confirmSenha);
		}
		System.out.println("\nCadastro realizado com sucesso!");
		System.out.println("Deseja realizar login?");
		System.out.println("\n1 - Sim");
		System.out.println("2 - Não, sair");
		System.out.print("\nEscolha uma opção: ");
		int op = sys.nextInt();
		sys.nextLine();
			
		while(op!=1 && op!=2) {
			System.out.println("Opção inválida! Tente novamente.");
			System.out.println("\nDeseja realizar login?");
			System.out.println("\n1 - Sim");
			System.out.println("2 - Não, sair");
			System.out.print("\nEscolha uma opção: ");
			op = sys.nextInt();
			sys.nextLine();
		}
		return op;
    }
}