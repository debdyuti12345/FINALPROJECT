package a;

import java.util.Scanner;

public class imageupload {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int L=0,N=0;
    System.out.println("enter the maximum dimension");	
	L=sc.nextInt();
		if(L<=10000 && L>=1){
			System.out.println("no of photo upload ");
			N=sc.nextInt();
			for(int i=0;i<N;i++)
			{
				System.out.println("enter the length and breadth");
				int W=sc.nextInt();
				int H=sc.nextInt();
				if((W>=1 && W<=10000) && (H>=1 && H<=10000)){
					{
					if(W<L || H>L)
						System.out.println("Upload another");
					   else if(W>=L && H>=L)
						{
							if(W==H)
								System.out.println("Accepted");
							else
								System.out.println("crop it");
						}
					}
				}
			}
		}
}
}


