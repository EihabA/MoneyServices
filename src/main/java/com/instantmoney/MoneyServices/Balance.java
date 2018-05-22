package com.instantmoney.MoneyServices;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Balance
{
	@Id
	private int idsender; 
	
	@Column(nullable = false)
	private BigDecimal balance;
	
	@OneToOne (mappedBy = "balance")
	private Sender sender; 

	
public Balance(int id, BigDecimal startBalance)
	{
		this.idsender = id;
		this.balance = startBalance;
	}

public Balance()
{
	
}
	public int getIdsender() {
		return idsender;
	}
	public void setIdsender(int idsender) {
		this.idsender = idsender;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	} 
	
	public synchronized void Topup(BigDecimal amount)
	{
		if (balance!=null)
		{
		balance = balance.add(amount);
		
		}
		
		else {
			balance = balance.ZERO ;
			balance = balance.add(amount);
		}
		
		setBalance(balance);
	}
	
	public synchronized void  withdraw(BigDecimal amount)  
	{
		System.out.println("Entering the withdraw method: ......." + amount);
		
		System.out.println(amount.compareTo(balance));
		
		if (balance!=null)
		try 
		{
			
			if (amount.compareTo(balance)>0);
			 
		}
		catch (java.lang.ArithmeticException e)
		{
			System.out.println("Exception: not enough balance to withdraw");
		}
		
		if (amount.compareTo(balance)<=0)
		{
			balance = balance.subtract(amount);
		}
		 
		setBalance(balance);
		
		System.out.println("balance after subtraction: " + balance);

	}
	
	@Override
	public String toString() {
		return "Balance [idsender=" + idsender + ", balance=" + balance + "]";
	}

}

