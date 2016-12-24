package projectEuler;

public class P14CS {
	
	public static void main(String args[]){
		long n=0;long _final=13; long highest=0;
		long final_number=0;
		
		for(long j,j1=1000000;j1>1;j1--){
			j=j1;
			for(long i=Long.MAX_VALUE;i>1;i--){
				n++;
				if(n==1){
					System.out.println(j);
				}
				System.out.println(CollatzSequence(j));
				j=CollatzSequence(j);
				if(j==1){
					n++;
					System.out.println("completed :"+n);
					n--;
					if(n>highest){
						highest=n;
						final_number=j1;
					}
					i=1;
					n=0;
				}
			}
		}
		highest++;
		System.out.println("Highest was "+highest+" at "+final_number);
	}
	
	public static long CollatzSequence(long a){
		if(a%2==0){
			return a/2;
		}else{
			return (3*a)+1;
		}
	}

}
