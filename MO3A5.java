package projectEuler;

public class MO3A5 {
	
	public static void main(String args[]){
		int total=0;
		for(int i=1;i<1000;i++){
			if(i%3==0||i%5==0){
				total=total+i;
			}
		}
		System.out.println(total);
	}

}
