package loginCad;

public class Cadastro {
	private String cadEmail;
	private String cadCpf;
	private String cadSenha;
	private String confirmSenha;

	public void setCadSenha(String cadSenha) {
		this.cadSenha = cadSenha;
	}
	public String getCadSenha() {
		return cadSenha;
	}
	
	public void setCadCpf(String cadCpf) {
		this.cadCpf = cadCpf;
	}
	public String getCadCpf() {
		return cadCpf;
	}
	
	public void setConfirmSenha(String confirmSenha) {
		this.confirmSenha = confirmSenha;
	}
	public String getConfirmSenha() {
		return confirmSenha;
	}
	
	public void setCadEmail(String cadEmail){
		this.cadEmail = cadEmail;
	}
	public String getCadEmail(){
		return cadEmail;
	}
}
