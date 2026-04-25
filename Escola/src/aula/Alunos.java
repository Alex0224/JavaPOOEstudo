package aula;

public class Alunos {
	int raAluno;
	static int totalAlunosCadastrados;
	String nomeAluno, emailAluno, cursoCadastrado;
	
	
	// Setters
	
	public void setAlunoRA(int raAluno) {
		this.raAluno = raAluno;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}
	
	public void setCursoCadastrado(String nomeDoCurso) {
		this.cursoCadastrado = nomeDoCurso;
	}
	
	public void setCadastrarAluno() {
		totalAlunosCadastrados += 1;
	}
	
	// Getters
	
	public int getAlunoRA() {
		return raAluno;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public String getEmailAluno() {
		return emailAluno;
	}
	
	public int getTotalAlunosCadastrados() {
		return totalAlunosCadastrados;
	}
	
	public String getCursoCadastrado() {
		return cursoCadastrado;
	}
	
	public void mostrarDadosAluno() {
		System.out.println("Nome do aluno: " + this.nomeAluno);
		System.out.println("Email do aluno: " + this.emailAluno);
		System.out.println("Curso cadastrado: " + this.cursoCadastrado);
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	
}
