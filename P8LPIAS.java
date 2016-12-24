package projectEuler;

import java.util.Scanner;

public class P8LPIAS {
	
	public static void main(String args[]){
		int n=0;
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int j=0;int total=1;int high=0;
		for(int i=0;i<str.length();i++,j++){
			total=total*Character.getNumericValue(str.charAt(i));
			if(j==4){
				n++;
				i=n;
				if(total>high){
					high=total;
				}
				j=0;
				total=1;
			}
			
		}
		System.out.println(high);
	}

}
