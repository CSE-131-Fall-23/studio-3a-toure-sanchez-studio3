package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("All prime nunbers up to which number?");
		int n = in.nextInt();
		boolean [] sieve_items = new boolean[n];
		//System.out.println(sieve_items);
for (int i=2; i<sieve_items.length; i++)
{
	sieve_items [i] = true;
	System.out.println(sieve_items[i]);//test print
	
	for (int j=2; j<sieve_items.length; j++) {
		i=j;
		i=i+j;
		sieve_items[i]=false;
			//[j] = true;
			//System.out.println(j);//test print
		}
		//else
		//{
		//sieve_items [i*j]= false;
		//System.out.println(sieve_items[j]);
	//}
}
}
}



