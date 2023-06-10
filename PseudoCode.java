package week3;

public class PseudoCode {

	public static void main(String[] args) {

     int[] num={3,2,11,4,6,7};	
     int[] num1={1,2,8,4,9,7};
     
     int length=num.length;
     System.out.println("total size of the length:"+ length);
     
     for(int i=0;i<num.length;i++)
     {
    	 for(int j=0;j<num1.length;j++)
    	 {
    		if(num[i]==num1[j])
    		{
    			System.out.println("Number is matched:"+num[i]);
    		}
    	 }
     }
     
	}

}

