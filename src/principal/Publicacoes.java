package principal;
import principal.Projetos;
import principal.Colaborador;
import principal.Status;
import java.util.ArrayList;
import java.util.List;

public class Publicacoes {	
	private List<Colaborador>autores = new ArrayList<Colaborador>();
	private String titulo;
	private String nomeConferencia;
	private int anoPub;
	private Projetos projetoAssociado;
	
	public Publicacoes(String titulo, String nomeConferencia, int anoPub,Projetos projetoAssociado) {	
		this.titulo = titulo;
		this.nomeConferencia = nomeConferencia;
		this.anoPub = anoPub;
		this.projetoAssociado = projetoAssociado;
	}
	public Projetos getProjetoAssociado() {
		return projetoAssociado;
	}
	public String toString()
	{
		return titulo;
	}
	public void setProjetoAssociado(Projetos projetoAssociado) { /// testar
		if (projetoAssociado.getStatus() == "Em Andamento")
		{
			this.projetoAssociado = projetoAssociado;
			System.out.println("Publicação Associada ao projeto: "+ projetoAssociado.toString()+ "com sucesso.");
		}
		else {
			System.out.println("A Publicação Não pode ser Associada a esse projeto ");
		}
		
	}
	/*Autor*/
	public List<Colaborador> getAutores() {
		return autores;
	}
	public void addAutores(Colaborador autor) {
		
		autores.add(autor);
		autor.addPublicacoes(this);
	}
	/*titulo*/
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/*conferencia*/
	public String getNomeConferencia() {
		return nomeConferencia;
	}
	public void setNomeConferencia(String nomeConferencia) {
		this.nomeConferencia = nomeConferencia;
	}
	/*publicaçao*/
	public int getAnoPublicacao() {
		return anoPub;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPub = anoPublicacao;
	}
	
	 
	

}
