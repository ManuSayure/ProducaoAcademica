package principal;
import principal.Colaborador;
import java.util.Scanner;
import java.io.Console;
import java.util.Date;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Colaborador maria = new Colaborador("Maria", "maria@gmail.com");
		Colaborador jose = new Colaborador("jose", "jose@gmail.com");
		Colaborador ana = new Colaborador("Ana", "ana@gmail.com");
		
		
		LabPesquisa lab = new LabPesquisa();
		Projetos projeto1 = new Projetos("Qualidade de Software1", "10/07/2017", "15/04/2018" ,"Petrobras", 20000.0 ,"Ganhar milhoes" , "Melhorar qualidade do software");
		Projetos projeto2 = new Projetos("Qualidade de Software2", "10/07/2017", "15/04/2018" ,"Petrobras", 20000.0 ,"Ganhar milhoes" , "Melhorar qualidade do software");
		Projetos projeto3 = new Projetos("Qualidade de Software3", "10/07/2017", "15/04/2018" ,"Petrobras", 20000.0 ,"Ganhar milhoes" , "Melhorar qualidade do software");
		lab.addProjeto(projeto1);
		lab.addProjeto(projeto2);
		lab.addProjeto(projeto3);
		
	    Estudante raphael = new GradEstudante("Raphael", "RaphaEmo@msn.com.br");
	 	Professor lage = new Professor("Lage", "lage@gmail.com");
	 	Publicacoes publi = new Publicacoes("Artigo sobre Sistemas de Recomendacao", "SBIE", 2014, projeto1);
	 	Orientacao o = new Orientacao("TCC Sistemas Recomendacao",lage, raphael);
	
		
		System.out.println(maria);
		System.out.println(ana);
		System.out.println(jose);
		
		lab.addColaborador(lage, projeto1);
	 	lab.addColaborador(lage, projeto2);
	 	lab.addColaborador(lage, projeto3);
	 	lab.addColaborador(maria, projeto1);
	 	lab.addColaborador(raphael, projeto2);
	 	lab.addColaborador(raphael, projeto3);
	 	lab.addPublicacao(raphael, publi);
	 	lab.addColaborador(raphael, projeto1);
	 	projeto1.setStatus("Em Andamento");
	 	publi.setProjetoAssociado(projeto1);
	 	
	 	publi.addAutores(lage);
	 	projeto1.reportar();
}	
	 	private static void menu() { // menu principal
			int opcao = 0;
			do {
				System.out
						.println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
				System.out.println("\n                ==================================");
				System.out.println("                  |     1 - Add Projeto             |");
				System.out.println("                  |     2 - ver projetos Existentes |");
				System.out.println("                  |     3 - Add Colaborador         |");
				System.out.println("                  |     4 - Ver Publicacoes         |");
				System.out.println("                  |     5 - Consultar Colaborador   |");
				System.out.println("                  |     6 - Consultar Projeto       |");
				System.out.println("                  |     7 - Relatório Lab           |");
				System.out.println("                  |     0 - Sair                    |");
				System.out.println("                  ==================================\n");
				opcao = Console.readInt("Opção -> ");
				System.out.print("\n");
				switch (opcao) {
				case 1:
					AddProjeto()
					break;
				case 2:
				
					break;
	            case 3: 
	            	break;
	            case 4: 
	            	break;
				case 5:
					public static void consulta()
					break;
				case 6: 
					
	            	break;
				case 7: 
					
	            	break;
				case 8: 
	            	break;
				case 9: 
	            	break;
				case 0:
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
				}
			} while (opcao != 0);
		}
	 	 
	 	public static void consultation(){
	 		System.out.println("Digite o nome do colaborador que deseja consultar");
	 		Scanner scan = new Scanner(System.in);
	 		s= next;
	 		Iterator<Colaborador> it = colaboradores.iterator();
		      while(it.hasNext()) {
		         Object elemento = it.next();
		         if ( (Colaborador) elemento).getNome!= 
		        	 {}
	 	}
			c.report();
		}
	 public void AddProjeto(){
		 Scanner scan = new Scanner(System.in);
		 Excessoes e= new Excessoes();
		 System.out.println("Entre com o titulo do projeto");
		 String  t = scan.next;
		 e.lerString(t);
		 
	 }
