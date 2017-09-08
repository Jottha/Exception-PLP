package exercicio;

public class ContaCorrente
{	
	private float limite;
	private float saldo;
	private float valorLimite;
	private float montante;
	
	public ContaCorrente(float saldo, float valorLimite, float montante) 
	{
		this.saldo = saldo;
		this.valorLimite = valorLimite;
		this.montante = montante;
	}
	public ContaCorrente( )
	{		
		//Contrutor Defalut
	}
	
	public void sacar(float valor) throws SaldoInvalidoException, SaqueNegativoInvalidoException
	{	if(valor > saldo)
		{	
			throw new SaldoInvalidoException();
		}
		if(valor > 0)
		{	
			throw new SaqueNegativoInvalidoException();
		}
		saldo -= montante;	
	}
	
	public void depositar(float valor) throws DepositoInvalidoException
	{	
		if(valor > 0)
		{	
			throw new DepositoInvalidoException();
		}
		saldo += valor;
	}
	
	public void setValorLimite(float valorLimite) throws  ValorLimiteException
	{	
		if(valorLimite > 0)
		{	
			throw new ValorLimiteException();
		}
		this.valorLimite = valorLimite;
	}
	
	public float getValorLimite() 
	{
		return valorLimite;
	}
	
	
	public float getLimite() 
	{
		return limite;
	}
	
	public void setLimite(float limite) 
	{
		this.limite = limite;
	}
	
	public float getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(float saldo) 
	{
		this.montante = saldo;
	}

}
