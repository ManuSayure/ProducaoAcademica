package principal;
import principal.Colaborador;
import principal.Status;
import principal.LabPesquisa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;


public class Projetos {
	private String titulo;
	private String dataInicio;
	private String dataFim;
	private String agenciaFinanciadora;
	private Double valorFinanciado;
	private String objetivo;
	private String descricao;
	private List<Colaborador> participantes = new ArrayList<Colaborador>();
	private List<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
	
	private Status status;
	
	public Projetos(String titulo, String dataInicio, String dataFim, String agenciaFinanciadora, double valorFinanciado, String objetivo, String descricao){
		this.setTitulo(titulo);
		this.setDataInicio(dataInicio);
		this.setDataFim(dataFim);
		this.setAgenciaFinanciadora(agenciaFinanciadora);
		this.setValorFinanciado(valorFinanciado);
		this.setObjetivo(objetivo);
		this.setDescricao(descricao);
		status = Status.EM_ELABORACAO;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	public String getAgenciaFinanciadora() {
		return agenciaFinanciadora;
	}
	public void setAgenciaFinanciadora(String agenciaFinanciadora) {
		this.agenciaFinanciadora = agenciaFinanciadora;
	}
	public Double getValorFinanciado() {
		return valorFinanciado;
	}
	public void setValorFinanciado(Double valorFinanciado) {
		this.valorFinanciado = valorFinanciado;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Colaborador> getParticipantes() {
		return participantes;
	}
	
	public String getStatus() {
		return status.toString();
	}
	public void addPublicacao(Publicacoes publicacao){
			publicacoes.add(publicacao);
		}
		
	public List<Publicacoes> getPublicacoes() {
		return publicacoes;
	}

	public String toString(){
		return titulo;
	}
	// Usando iterator para percorrer a lista Collaborator e verificar por professores e alunos	
		 public  boolean checaGradEstudanteProjetos(){		
			Iterator<Colaborador> it = participantes.iterator();
		      while(it.hasNext()) {
		         Object elemento = it.next();
		         if (elemento instanceof GradEstudante)
		         {
		        	 if(((GradEstudante) elemento).getNumeroProjetos()<2){
		        		 ((GradEstudante) elemento).somaNumeroProjetos(1);
		        		 return false;	         		 
		        	 }
		         }else return false; /// Caso o colaborador nem seja aluno de graduacao         
		      }
		      return true;
			
		}
		// Checa se é professor
		public boolean checaProfessor()
		{
		      Iterator<Colaborador> it = participantes.iterator();
		      while(it.hasNext()) {
		         Object elemento = it.next();
		         if (elemento instanceof Professor)
		         {
		        	 return true;
		         }
		      }
		      return false;
		}
	public void setStatus(String status) {
		if (status == "Em Andamento"){
			if (
					getTitulo()               == null ||
					getDataInicio()           == null ||
					getDataFim()              == null ||
					getAgenciaFinanciadora()   == null ||
					getValorFinanciado()      == 0.0  ||
					getObjetivo()             == null ||
					getDescricao()            == null ||
					getParticipantes().size() == 0
				)
			{
				System.out.println("Projeto Ainda em Elaboração, por favor preencha todos os dados.");
			}
			else if (checaGradEstudanteProjetos()){
				System.out.println("Projeto Não pode ir pra Em Andamento, pois existe um aluno com mais de 2 projetos Em Andmento.");
			}
			else{
				this.status = Status.EM_ANDAMENTO;
				}
		}
		else if (status == "Concluido")
		{
			if(this.getPublicacoes().size() == 0){
				System.out.println("Projeto nao pode ser concluido, pois não existe publicacoes");
			}
			else{
				this.status = Status.CONCLUIDO;
				Iterator<Colaborador> it = participantes.iterator();
			      while(it.hasNext()) {
			         Object elemento = it.next();
			         if (elemento instanceof GradEstudante){
			        	 ((GradEstudante) elemento).somaNumeroProjetos(-1);			        	        		 
				      }
				
				
			      }
			 }
		}
		else if (this.status == Status.EM_ELABORACAO){
			System.out.println("Projeto nao esta Em Andamento pra ser concluido");			
		}
		else{
			System.out.println("Projeto ja esta Concluido");
		}
}
	
	
		
		//Restrição de professores como participantes em um projeto	
		public void addParticipante(Colaborador participante)
		{
			if(status == Status.EM_ELABORACAO)
			{
				if (participante instanceof Professor)
				{
					participantes.add(participante);
					//participante.addProjeto(this);
					
				} else {
					if (checaProfessor())
					{
						participantes.add(participante);
						//participante.addProjeto(this);
					} else {
						System.out.println("Insira um Professor primeiro!");
					}
				}
			}else{
				System.out.println("Projeto nao esta em elaboracao, nao foi possivel alocar mais participantes");
			}
		}

				
	

	//Informações do projeto
	public void reportar(){
		System.out.println("Titulo: "+this.getTitulo()+
				"\nData Inicio: "+this.getDataInicio()+
				"\nData Final: "+this.getDataFim()+
				"\nAgencia Financiadora: "+this.getAgenciaFinanciadora()+
				"\nValor Financiado: "+this.getValorFinanciado()+
				"\nObjetivo: "+this.getObjetivo()+
				"\nDescricao: "+this.getDescricao()+
				"\nStatus: "+this.getStatus()+
				"\nColaboradores: "+this.getParticipantes()+			
				"\nProducao Academica: "+this.getPublicacoes()
				);
		
	}

		
	}



