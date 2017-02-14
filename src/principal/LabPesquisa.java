package principal;
import java.util.ArrayList;
import java.util.Iterator;

import principal.Publicacoes;
import principal.Colaborador;
import principal.Projetos;


public class LabPesquisa {

	// Projetos, colaborações, publicações e orientações associadas a um laboratório
		protected ArrayList<Projetos> projetos = new ArrayList<Projetos>();
		protected ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
		protected ArrayList<Publicacoes> publicacoes = new ArrayList<Publicacoes>();
		protected ArrayList<Orientacao> orientacoes = new ArrayList<Orientacao>();	
		
		private int N_elabProjs=0;
		private int N_andamentProjs=0;
		private int N_conclProjs=0;
		
	// Adição de um projeto no laboratório e verificação se o mesmo já existe no laboratório
		public void addProjeto(Projetos p){
			if(!(this.projetos.contains(p))){
				projetos.add(p);					
			}else
				System.out.println("Projeto ja pertencente ao Lab!");
			
		}
		
		public Projetos getProjeto(Projetos p){
			return projetos.get(projetos.indexOf(p));
		}
		
		public ArrayList<Projetos> getProjetos(){
			return projetos;
		}

	// Usando iterator para percorrer a lista Projetos e calcular o número de 
	// projetos em diferentes status	
		public void countProjectsByStatus(){
			Iterator<Projetos> it = projetos.iterator();
		      while(it.hasNext()) {
		         Object elemento = it.next();
		         if ( ((Projetos) elemento).getStatus() == Status.EM_ELABORACAO.toString() ){
		        	 N_elabProjs++;
		         }else if(((Projetos) elemento).getStatus() == Status.EM_ANDAMENTO.toString() ){
		        	 N_andamentProjs++;
		         }else if(((Projetos) elemento).getStatus() == Status.CONCLUIDO.toString()){
		        	 N_conclProjs++;
		         }	         
		      }		
		}

	// Adicionando colaboradores em um projeto
		public void addColaborador(Colaborador c, Projetos p){
		    if(this.colaboradores.contains(c)){
		      p.addParticipante(c);  
		    } else {
		      colaboradores.add(c);
		      p.addParticipante(c);
		    }
		  }
		
		public Colaborador getColaborador(Colaborador c){
			return colaboradores.get(colaboradores.indexOf(c));
		}
		
		public ArrayList<Colaborador> getColaborador(){
			return colaboradores;
		}

	// Vinculando colaboradores e publicações
		public void addPublicacao(Colaborador c,Publicacoes publi){
			if(this.colaboradores.contains(c)){
				publi.addAutores(c);
				publicacoes.add(publi);
			}else {
				colaboradores.add(c);
				publi.addAutores(c);
				publicacoes.add(publi);
			}		
		}
		
		public ArrayList<Publicacoes> getPublicacoes() {
			return publicacoes;
		}

		public ArrayList<Orientacao> getOrientacoes(){
			return orientacoes;
		}

	// Relatório contendo todas as informações de um laboratório de pesquisa	
		protected void reportar(){
			this.countProjectsByStatus();
			System.out.println("Numero de colaboradores: "+colaboradores.size()+
							   "\nNumero de projetos em elaboracao: "+N_elabProjs+ 
							   "\nNumero de projetos em andamento: "+N_andamentProjs+ 
							   "\nNumero de projetos concluidos: "+N_conclProjs+ 
							   "\nNumero total de projetos: "+projetos.size()+
							   "\nNumero de producoes academicas por tipo de producao: "+
							   "\n -Publicacoes: "+publicacoes.size());
							  // "\n -Orientacoes: "+orientacoes.size()); 
		}  
		
	}

