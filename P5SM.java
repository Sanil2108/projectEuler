package projectEuler;

public class P5SM {
	
	public static void main(String args[]){
		int i;
		for(i=1;i<Integer.MAX_VALUE;i++){

			boolean check=true;
			for(int j=1;j<=20;j++){
				if(i%j!=0){
					check=false;
				}
				
			}
			if(check==true){
				System.out.println("\n"+i);
				return;
			}
			//System.out.println(i);
		}
	}

}
