package principal;
import java.util.ArrayList;
import principal.Orientacao;

public class Professor extends Colaborador {
	protected ArrayList<Orientacao> orientacoes = new ArrayList<Orientacao>();	
	
	public Professor(String nome, String email) {
		super(nome, email);
		// TODO Auto-generated constructor stub
	}
	public void addOrientacao(Orientacao o){
		if(!(this.orientacoes.contains(o))){
			orientacoes.add(o);					
		}else System.out.println("Orientacao ja pertencente ao Lab!");
	}
	
	
}
