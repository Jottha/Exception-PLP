package exercicio;

public class SaqueNegativoInvalidoException extends Exception 
{
	private static final long serialVersionUID = 1L;	
	
	public SaqueNegativoInvalidoException()
	{
		super("Voc� n�o pode sacar um valor negativo");
	}
	
}
