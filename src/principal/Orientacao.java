package principal;
import principal.Professor;
import principal.Estudante;
import principal.LabPesquisa;


public class Orientacao {
			
	private Professor orientador;
	private Estudante estudante; // GARANTE QUE SO A ENTIDADE ESTUDANTES SERAO VINCULADOR NA ORIENTAO
	private String titulo;
			
		// Vinculando aluno e professor a uma orientação	
			public Orientacao(String titulo,Professor orientador,Estudante estudante){
				this.titulo = titulo;
				this.orientador = orientador;
				this.estudante = estudante;
				
			}						
			public Professor getOrientador() {
				return orientador;
			}
			public void setOrientador(Professor orientador) {
				this.orientador = orientador;
			}
			public Estudante getEstudante() {
				return estudante;
			}
			public void setEstudante(Estudante estudante) {
				this.estudante = estudante;
			}
			public String getTitulo() {
				return titulo;
			}
			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}
			public String toString(){
				return titulo;
			}	
					

}
