package application;
/*
* Author : Jzagabe
* Date : Oct. 14, 2021
* Description : Programme permettant de calculer l'age d'un enfant
* dont la difference d'age est la même avec deux autres membres
* de la famille plus jeunes.
*/
import java.util.Scanner;

public class Aine {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int premier, second, troisieme,difference;
		premier=sc.nextInt();
		second=sc.nextInt();
		difference=second-premier;
		troisieme=second+difference;
		System.out.println(troisieme);
		
	

	}

}
