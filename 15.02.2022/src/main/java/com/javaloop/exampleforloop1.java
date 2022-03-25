package com.javaloop;

public class exampleforloop1 {

	public static void main(String[] args) 
	{
		int employeeIds[]= {201,322,654,965,755};
		double employeeSalaries[]= {90000,98000.65,44444.54,34789.9,66643.82};

		for(int employeeId:employeeIds)
		{
			System.out.println(employeeId);
		}
		System.out.println("**************");
		for (double employeeSalary:employeeSalaries)
		{
			System.out.println(employeeSalary);
		}
	}

}
