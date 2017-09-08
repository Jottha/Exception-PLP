package exercicio;

public class DepositoInvalidoException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	public DepositoInvalidoException()
	{
		super("O deposito não pode ser menor que zero");
	}

}
