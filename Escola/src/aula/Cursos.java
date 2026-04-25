package aula;

import java.text.NumberFormat;
import java.util.Locale;

public class Cursos {

	String nomeDoCurso;
	int cargaHorariaCurso;
	float valorMensalidadeCurso;
	static int totalCursosCriados;
	
	// Formatação do valor da mensalidade.
	NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));
	
	// Setters
	
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	
	public void setCargaHorariaCurso(int cargaHorariaCurso) {
		this.cargaHorariaCurso = cargaHorariaCurso;
	}
	
	public void setValorMensalidadeCurso(float valorMensalidadeCurso) {
		this.valorMensalidadeCurso = valorMensalidadeCurso;
	}
	
	public void setTotalCursosCriados() {
		totalCursosCriados += 1;
	}
	
	// Gettters
	
	public String getNomeDoCurso() {
		return this.nomeDoCurso;
	}
	
	public int getCargaHorarioCurso() {
		return this.cargaHorariaCurso;
	}
	
	public float getValorMensalidadeCurso() {
		return this.valorMensalidadeCurso;
	}
	
	public int getTotalCursosCadastrados() {
		return totalCursosCriados;	
	}
	
	public void mostrarDadosCurso() {
		
		String valorFormatado = nf.format(this.valorMensalidadeCurso) ;
		
		System.out.println("Nome do curso: " + this.nomeDoCurso);
		System.out.println("Carga Horária do Curso: " + this.cargaHorariaCurso + " horas.");
		System.out.println("Valor de sua mensalidade: R$ " + (valorFormatado));
		System.out.println("-------------------------------------------------------------------------------");
	}
}
