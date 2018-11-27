package com.hiya.se.base.tax;

public class TaxClient
{

	public static void main(String[] args)
	{
        
		TaxFactory.getTax2011().getTax(0);
		
		TaxFactory.getTax2018().getTax(0);
	}

}
