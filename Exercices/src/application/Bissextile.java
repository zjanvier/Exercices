package application;

import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 int an = sc.nextInt();
		 
	       boolean cd1 = (an % 4) == 0;
	       boolean cd2 = (an % 100) != 0;
	       boolean cd3 = ((an % 100 == 0) && (an % 400 == 0));

	        if (cd1 && (cd2 || cd3))
	        {
	            System.out.println("L'année " + an + " est bissextile");
	        }
	        else
	        {
	            System.out.println("L'année " + an +  " n'est pas bissextile");
	        }
	        sc.close();

	}

}
