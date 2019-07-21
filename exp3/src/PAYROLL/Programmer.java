package payroll;


public class Programmer extends  Employee {
	
	private double basic_pay;
	public double da;
	public double hra;
	public double pf;
	public double staff_club;
	public double gross_salary;
	public double net_salary;
	
	
	public Programmer()
	{
	basic_pay=0;
	
	}
	
	public Programmer(String n,long id,String ad,String mail,long mo,long bp)
	{
		super(n,id,ad,mail,mo);
		basic_pay=bp;
	}

	public void calculation()
	{
		da=(97/100)*basic_pay;
		hra=(10/100)*basic_pay;
		pf=(12/100)*basic_pay;
		staff_club=(0.1/100)*basic_pay;
		gross_salary=da+hra+pf+staff_club;
		net_salary=basic_pay-gross_salary;
	}
	
	
	
	
	public void printStatement()
	{
		super.printAccount();
		System.out.println("Employee Basic salary :"+basic_pay);
		System.out.println("Employee Gross salary :"+gross_salary);
		System.out.println("Employee Net salary :"+net_salary);
		
		

	}
}

	
	
	
	
	
	
	
	
	
	
	

