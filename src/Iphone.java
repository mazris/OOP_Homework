
public class Iphone extends AbstractCall implements CommunicationInt{

	@Override
	public void enterPhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("entering phone number using Siri or mannualy");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("hit the green button to call");
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println("hit the green button to answer");
	}

	@Override
	public void hangup() {
		// TODO Auto-generated method stub
		System.out.println("hit the red button to hangup");
	}
	public void videoCall(int phoneNumber)
	{
		super.videoCall(phoneNumber);
		System.out.println("choose facetime");
	}
	public void sendTextMsg(String msg , int phoneNumber)
	{
		super.sendTextMsg(msg, phoneNumber);
		
	}
	
	
	

}
