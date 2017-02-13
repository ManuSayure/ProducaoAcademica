package principal;

public class  GradEstudante extends Estudante  {
	private int numeroProjetos;

	public GradEstudante(String nome, String email) {
		super(nome, email);
		numeroProjetos = 0;
		// TODO Auto-generated constructor stub
	}

	public int getNumeroProjetos() {
		return numeroProjetos;
	}

	public void somaNumeroProjetos(int n) {
		this.numeroProjetos += n;
	}
	
	
	

	

}
