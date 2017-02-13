package principal;
import principal.Projetos;
import principal.Colaborador;
import principal.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Publicacoes {
	private List<Colaborador>autores = new ArrayList<Colaborador>();
	private String titulo;
	private String nomeConferencia;
	private Date anoPub;
	private Projetos projetoAssociado;
	
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
			System.out.println("Publica��o Associada ao projeto: "+ projetoAssociado.toString()+ "com sucesso.");
		}
		System.out.println("A Publica��o N�o pode ser Asociada a esse projeto ");
		
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
	/*publica�ao*/
	public Date getAnoPublicacao() {
		return anoPub;
	}
	public void setAnoPublicacao(Date anoPublicacao) {
		this.anoPub = anoPublicacao;
	}
	
	 
	

}
