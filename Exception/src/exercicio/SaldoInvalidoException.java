package exercicio;

public class SaldoInvalidoException extends Exception
{	
	private static final long serialVersionUID = 1L;

	public SaldoInvalidoException()
	{
		super("Saldo insuficiente para realizar o saque");
	}

}
