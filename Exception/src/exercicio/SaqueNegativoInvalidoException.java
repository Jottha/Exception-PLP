package exercicio;

public class SaqueNegativoInvalidoException extends Exception 
{
	private static final long serialVersionUID = 1L;	
	
	public SaqueNegativoInvalidoException()
	{
		super("Você não pode sacar um valor negativo");
	}
	
}
