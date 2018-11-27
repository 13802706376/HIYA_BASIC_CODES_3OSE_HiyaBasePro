package com.hiya.se.base.tax;

public class PersonalTax2011 implements IPersonalTax
{
	@Override
	public int getTax(int income)
	{
		System.out.println("******************28000 for 2011********************");
		System.out.println(28000-304-((28000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************29000 for 2011********************");
		System.out.println(29000-304-((29000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************30000 for 2011********************");
		System.out.println(30000-304-((30000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************30800 for 2011********************");
		System.out.println(30800-304-((30800-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************31000 for 2011********************");
		System.out.println(31000-304-((31000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************32000 for 2011********************");
		System.out.println(32000-304-((32000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************33000 for 2011********************");
		System.out.println(33000-304-((33000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************34000 for 2011********************");
		System.out.println(34000-304-((34000-304-3500)*0.25-1005));
		System.out.println();
		
		System.out.println("******************35000 for 2011********************");
		System.out.println(33500-304-((33500-304-3500)*0.25-1005));
		System.out.println();
		return 0;
	}
	
	public enum SigleInstance
	{
		INSTANCE;
		public IPersonalTax instance;
		SigleInstance()
		{
			instance = new PersonalTax2011();
		}
	}
}
