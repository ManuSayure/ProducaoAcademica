package principal;
import principal.Colaborador;
import principal.Status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;


public class Projetos {
	private String titulo;
	private Date dataInicio;
	private Date dataFim;
	private String AgenciaFianciadora;
	private Double valorFinanciado;
	private String objetivo;
	private String descricao;
	private List<Colaborador> participantes = new ArrayList<Colaborador>();
	private List<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
	
	private Status status;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Projetos() {
		super();
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getAgenciaFianciadora() {
		return AgenciaFianciadora;
	}
	public void setAgenciaFianciadora(String agenciaFianciadora) {
		AgenciaFianciadora = agenciaFianciadora;
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
	public void setStatus(String status) {
		if (status == "Em Andamento"){
			if (
					getTitulo()               == null ||
					getDataInicio()           == null ||
					getDataFim()              == null ||
					getAgenciaFianciadora()   == null ||
					getValorFinanciado()      == 0.0  ||
					getObjetivo()             == null ||
					getDescricao()            == null ||
					getParticipantes().size() == 0
				)
			{
				System.out.println("Projeto Ainda em Elaboração, por favor preencha todos os dados.");
			}
			else if (ChecaGradEstudanteProjetos()){
				System.out.println("Projeto Não pode ir pra Em Andamento, pois existe um aluno com mais de 2 projetos Em Andmento.");
			}
			else{
				this.status = Status.EM_ANDAMENTO;
				}
		}
		else if (status == "Concluido")
		{
			if(this.getPublicaçoes().size() == 0){
				System.out.println("Projeto nao pode ser concluido, pois não existe publicacoes");
			}
			else{
				this.status = Status.CONCLUIDO;
				Iterator<Colaborador> it = participantes.iterator();
			      while(it.hasNext()) {
			         Object element = it.next();
			         if (element instanceof GradEstudante){
			        	 ((GradStudent) element).addNumeroProjeto(-1);			        	        		 
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
	
	// Usando iterator para percorrer a lista Collaborator e verificar por professores e alunos	
		public boolean checaGradEstudanteProjetos(){		
			Iterator<Colaborador> it = participantes.iterator();
		      while(it.hasNext()) {
		         Object element = it.next();
		         if (element instanceof GradEstudante)
		         {
		        	 if(((GradEstudante) element).getNumeroProjetos()<2){
		        		 ((GradEstudante) element).somaNumeroProjetos(1);
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
		         Object element = it.next();
		         if (element instanceof Professor)
		         {
		        	 return true;
		         }
		      }
		      return false;
		}
		//Restrição de professores como participantes em um projeto	
		public void addParticipante(Colaborador participante)
		{
			if(status == Status.EM_ELABORACAO)
			{
				if (participante instanceof Professor)
				{
					participantes.add(participante);
					participante.addProjeto(this);
					
				} else {
					if (checaProfessor())
					{
						participantes.add(participante);
						participante.addProjeto(this);
					} else {
						System.out.println("Insira um Professor primeiro!");
					}
				}
			}else{
				System.out.println("Projeto nao esta em elaboracao, nao foi possivel alocar mais participantes");
			}
		}

				
	public void addPublication(Publication publication){
			publicacoes.add(publication);
		}
		
	public List<Publication> getPublications() {
		return publications;
	}

	public String toString(){
		return title;
	}

	//Informações do projeto
	public void report(){
		System.out.println("Titulo: "+this.getTitle()+
				"\nData Inicio: "+this.getBeginDate()+
				"\nData Final: "+this.getEndDate()+
				"\nAgencia Financiadora: "+this.getFundingAgency()+
				"\nValor Financiado: "+this.getFinancedValue()+
				"\nObjetivo: "+this.getObjective()+
				"\nDescricao: "+this.getDescription()+
				"\nStatus: "+this.getStatus()+
				"\nColaboradores: "+this.getParticipants()+			
				"\nProducao Academica: "+this.getPublications()
				);
		
	}

		
	}

	}

