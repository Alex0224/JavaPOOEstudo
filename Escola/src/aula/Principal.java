package aula;

public class Principal {

	public static void main(String[] args) {
		
		Cursos curso1 = new Cursos();
		
			curso1.setNomeDoCurso("Engenharia da Computação");
			curso1.setValorMensalidadeCurso(1600);
			curso1.setCargaHorariaCurso(4000);
			curso1.setTotalCursosCriados();
		
		Cursos curso2 = new Cursos();
		
			curso2.setNomeDoCurso("Análise e Desenvolvimento de Sistemas");
			curso2.setValorMensalidadeCurso(1200);
			curso2.setCargaHorariaCurso(2500);
			curso2.setTotalCursosCriados();
		
		Alunos aluno1 = new Alunos();
		
			aluno1.setAlunoRA(1);
			aluno1.setNomeAluno("Alex Assis");
			aluno1.setEmailAluno("alex@exemplo.com");
			aluno1.setCursoCadastrado(curso1.nomeDoCurso);
			aluno1.setCadastrarAluno();
		
		Alunos aluno2 = new Alunos();
		
			aluno2.setAlunoRA(2);
			aluno2.setNomeAluno("Pablo Marcos");
			aluno2.setEmailAluno("Pablo@exemplo.com");
			aluno2.setCursoCadastrado(curso2.nomeDoCurso);
			aluno2.setCadastrarAluno();
		
			
		aluno1.mostrarDadosAluno();
		curso1.mostrarDadosCurso();
		aluno2.mostrarDadosAluno();
		curso2.mostrarDadosCurso();
		
	}

}
