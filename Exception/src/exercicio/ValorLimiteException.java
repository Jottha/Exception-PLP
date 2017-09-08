package exercicio;

public class ValorLimiteException extends Exception
{	
	private static final long serialVersionUID = 1L;
	
	public ValorLimiteException()
	{
		super("O Valor Limite não pode ser negativo");
	}

}
