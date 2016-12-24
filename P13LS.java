package projectEuler;

public class P13LS {
	
	public static void main(String args[]){
		int max_value=1000;
		for(int i =1;i<max_value;i++){
			for(int j =1;j<max_value;j++){
				for(int k =1;k<max_value;k++){
					if(i*i+j*j==k*k&&i+j+k==1000){
						System.out.println(i*j*k);
					}
				}
			}
		}
	}
}
