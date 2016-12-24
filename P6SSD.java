package projectEuler;

public class P6SSD {
	
	public static void main(String args[]){	
		int total1=0;
		for(int i=0;i<=100;i++){
			total1=total1+(i*i);
		}
		
		int total2=0;
		for(int i=0;i<=100;i++){
			total2=i+total2;
		}
		
		total2=total2*total2;
		
		System.out.println(total2-total1);
	}

}
