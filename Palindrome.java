package week3;

public class Palindrome {

	public static void main(String[] args) {
		
		String name="MADAM";
		String rev=" ";
		
		char[] ch = name.toCharArray();
	    for(int i = ch.length-1;i>=0; i--)
	    	
	    {
	    	      rev=rev+ch[i];
	    	      System.out.print(ch[i]);
	             
	    if(name.equals(rev)) {
            System.out.println("It Is Not Palindrome" +rev);
        }else {
            System.out.println("It Is  Palindrome" +rev);
        }
        
	    }
		
	}

}
