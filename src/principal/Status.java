package principal;

public enum Status {
	EM_ELABORACAO, EM_ANDAMENTO, CONCLUIDO;
	
	public String  toString()
		{
			switch(this)
			{
				case EM_ELABORACAO:
					return "Em Elaboracao";
					
				case EM_ANDAMENTO:
					return "Em Andamento";
					
				case CONCLUIDO:
					return "Concluido";
				default:
					return null;
			}
		}
}

