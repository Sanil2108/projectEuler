package projectEuler;

public class P4LPP {
	
	public static void main(String args[]){
		long total=0;
		
		int ijkl=1000;
		
		for(int i=1;i<ijkl;i++){
			for(int j=1;j<ijkl;j++){
				boolean isP=isPalindrome(i*j);
				if(isP&&i*j>total){
				total=i*j;
				}
				System.out.println(i+"_"+j+"_"+isP+"_"+total);
			}
			
		}
		
		System.out.println(total);
		//System.out.println(isPalindrome(12324));
		
	}
	
	public static boolean isPalindrome(long a){
		boolean isP=true;
		String str=Long.toString(a);
		for(int i=0;i<str.length();i++){
			char a2=str.charAt(i);
			char b2=str.charAt(str.length()-(1+i));
			if(isP==true&&
					a2==b2){
				isP=true;
			}else{
				isP=false;
			}
		}
		return isP;
	}

}
