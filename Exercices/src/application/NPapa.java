package application;

import java.util.Scanner;

public class NPapa {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				int nombre=sc.nextInt();
				if (nombre==1 || nombre==10 || nombre==9)
				{
					System.out.println("1");
				}
				else if (nombre<=3)

				{
					System.out.println("2");
				}
				else if (nombre<=8)
				{
					System.out.println("3");
				}
				else
				{
					System.out.println("Error");
				}
				sc.close();		

	}

}
