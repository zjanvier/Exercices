package application;

import java.util.Scanner;

public class Switch1 {


	public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        String lettre=sc.nextLine();
        switch (lettre)
        {
        case "a":
        case "e":
        case "o":
        case "u":
        case "i":
        case "y":
        	System.out.println("Voyelle");
        	break;
        default:
        	System.out.println("Consonne");
        	
        }
        
        
        
        
       /* int jour=sc.nextInt();
        
        switch (jour)
        {
        case 1:
        	System.out.println("Lundi");
        	break;
        case 2:
        	System.out.println("Mardi");
        	break;
        case 3:
        	System.out.println("Mercredi");
        	break;
        case 4:
        	System.out.println("Jeudi");
        	break;
        case 5:
        	System.out.println("Vendredi");
        	break;
        case 6:
        	System.out.println("Samedi");
        	break;
        case 7:
        	System.out.println("Dimanche");
        	break;
        default:
        	System.out.println("Erreur");
        	
        }
        */

    
    }


}
