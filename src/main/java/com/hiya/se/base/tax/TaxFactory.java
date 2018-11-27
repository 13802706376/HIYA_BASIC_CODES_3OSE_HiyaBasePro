package com.hiya.se.base.tax;

public class TaxFactory
{
	public static IPersonalTax getTax2011()
	{
		return PersonalTax2011.SigleInstance.INSTANCE.instance;
	}
	
	public static  IPersonalTax getTax2018()
	{
		return PersonalTax2018.SigleInstance.INSTANCE.instance;
	}
}
