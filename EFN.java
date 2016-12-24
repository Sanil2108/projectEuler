package projectEuler;

public class EFN {
	
	public static void main(String args[]){
		int a=1; int b=2;
		int n=3;
		int total=0;
		int total2=0;
		for(int i=1;i<Integer.MAX_VALUE;i++,n++){
			
			
			System.out.println(a);

			if(n%2==0){
				total2=total2+a;
			}
			total=a+b;
			a=b;
			b=total;
			
			if(total>4000000){
				
				System.out.println(a);
				n--;
				if(n%2==0){
					total2=total2+a;
					System.out.println("\n\n"+total2);
					return;
				}
				System.out.println("\n\n"+total2);
				return;
			}
		}

	}

}
