package exercicio;

public class ValorLimiteException extends Exception
{	
	private static final long serialVersionUID = 1L;
	
	public ValorLimiteException()
	{
		super("O Valor Limite n�o pode ser negativo");
	}

}
