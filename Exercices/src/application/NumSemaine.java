package application;

import java.util.Scanner;

public class NumSemaine {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int semaine;
		semaine= sc.nextInt();
		if (semaine==1)
			System.out.println("lundi");
		else if (semaine==2)
			System.out.println("mardi");
		else if (semaine==3)
			System.out.println("mercredi");
		else if (semaine==4)
			System.out.println("jeudi");
		else if (semaine==5)
			System.out.println("vendredi");
		else if (semaine==6)
			System.out.println("samedi");
		else if (semaine==7)
			System.out.println("dimanche");
		else
			System.out.println("Erreur");
		sc.close();


	}

}
