package week1.day1;

public class Mobile {
	public void makeCall()
	{
			String mobileModel ="IPHONE 12";
			float mobileWeight =1.65f;
			System.out.println("This is my mobile");
			System.out.println(mobileModel);
			System.out.println(mobileWeight);
			
		}
	public void sendMsg()
	{
		boolean Charged=true;
		int cost=50000;
		System.out.println("isfullyCharged:"+Charged);
		System.out.println(cost);
			}
	public static void main(String[] args) {
		Mobile m =new Mobile();
		m.makeCall();
		m.sendMsg();
	}		
		}
	


