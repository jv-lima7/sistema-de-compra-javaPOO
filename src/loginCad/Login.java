
package loginCad;

public class Login {
	private String logEmail;
	private String logCpf;
	private String logSenha;
	private String logConfirmSenha;

	public void setLogEmail(String logEmail){
		this.logEmail = logEmail;
	}
	public String getLogEmail(){
		return logEmail;
	}

	public void setLogSenha(String logSenha) {
		this.logSenha = logSenha;
	}
	public String getLogSenha() {
		return this.logSenha;
	}

	public void setLogCpf(String logCpf) {
		this.logCpf = logCpf;
	}
	public String getLogCpf() {
		return logCpf;
	}
	
	public void setLogConfirmSenha (String logConfirmSenha) {
		this.logConfirmSenha = logConfirmSenha;
	}
	public String getLogConfirmSenha() {
		return this.logConfirmSenha;
	}
}