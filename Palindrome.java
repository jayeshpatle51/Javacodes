
public class Palindrome{

public boolean isPalinDrome(String str){

    int j=str.length()-1;

		for(int i=0;i<str.length()/2;i++) {
			
			if(!(str.charAt(i)==str.charAt(j))) {
				return false;
			}
			j--; 
         }
      return true;
}

public static void main(String[] args) {
  String str="12321";
		Palindrome p=new Palindrome();
       boolean b= p.isPalinDrome(str);
		if(b){
          System.out.println("This string is palindrome");
}else{
          System.out.println("This string is not palindrome");

}

	}
      }