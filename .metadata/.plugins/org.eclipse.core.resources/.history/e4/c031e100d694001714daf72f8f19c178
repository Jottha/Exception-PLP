package exercicio;

public class ContaCorrente
{	
	private float limte;
	private float saldo;
	private float valorLimite;
	private float montante;
	private float valor;
	
	public ContaCorrente(float limte, 
			float saldo, float valorLimite, float valor) 
	{
		super();
		this.limte = limte;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
		this.valor = valor;
		
	}
	
	public void sacar(float valor) throws SaldoInvalidoException , ValorLimiteException
	{	if(valor > saldo)
		{	
			throw new SaldoInvalidoException();
		}
		if(valor > valorLimite)
		{	
			throw new ValorLimiteException();
		}
		saldo -= montante;	
	}
	
	public void depositar(float valor)
	{	
		saldo += valor;
	}
	
	public float getLimte() 
	{
		return limte;
	}
	
	public void setLimte(float limte) 
	{
		this.limte = limte;
	}
	
	public float getSaldo() 
	{
		return saldo;
	}
	
	public void setSaldo(float saldo) 
	{
		this.saldo = saldo;
	}
	
	public float getValorLimite() 
	{
		return valorLimite;
	}
	
	public void setValorLimite(float valorLimite) 
	{
		this.valorLimite = valorLimite;
	}

}
