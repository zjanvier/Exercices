package application;

import java.util.Scanner;

public class VoyelleConsonne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nom;
		System.out.println("écris une lettre");
		nom=sc.nextLine().toLowerCase();
		
		if(nom.equals("a")||nom.equals("e")||nom.equals("u")||nom.equals("i")|| nom.equals("o"))
			System.out.println("voyelle");
		  
		/*if(nom.equals("e"))
			System.out.println("voyelle");
		
		if(nom.equals("i"))
			System.out.println("voyelle");
		
		if(nom.equals("o"))
			System.out.println("voyelle");
		
		if(nom.equals("u"))
			System.out.println("voyelle");
		*/
		else
			System.out.println("consonne");
	
			sc.close();


	}

}
