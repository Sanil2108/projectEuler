package projectEuler;


public class P16PDS {
	public static void main(String args[]){
		int total=1;
		long total2=0;
		for(int i=0;i<10;i++){
			total=2*total;
		}
		String str=Integer.toString(total);
		for(int j=0;j<str.length();j++){
			char c=str.charAt(j);
			total2=total2+Character.getNumericValue(c);
		}
		System.out.println(total2);
	}
}
