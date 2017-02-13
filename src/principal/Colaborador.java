package principal;
import principal.Projetos;
import java.util.ArrayList;
import java.util.List;
import principal.Publicacoes;

public class Colaborador {
	private String nome;
	private String email;
	private List<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
	private List<Projetos> projetos = new ArrayList<Projetos>();
	public Colaborador(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Publicacoes> getPublicacoes() { 
		return publicacoes;
	}	
	public void addPublicacoes(Publicacoes publicacao) {/// Falta criar esse método	
		publicacoes.add(publicacao);		
	} 
	
	public List<Projetos> getProjetos() {
		return projetos;
	}
	public void addProjetos(Projetos projeto) {// Falta criar esse método	
		projetos.add(projeto);
	}
	public String toString(){
		return "Nome:"+ this.nome + "\nEmail"+ this.email;
	}
	 //Relatório com nome, email, projetos e produção acadêmica vinculados
	 //a um colaborador(aluno ou professor)	
		public void reportar(){
			System.out.println("Nome: "+this.getNome()+
					"\nEmail: "+this.getEmail()+
					"\nLista de projetos: "+this.getProjetos()+
					"\nProducao Academica: "+this.getPublicacoes()
					);
			
		}
}
	




