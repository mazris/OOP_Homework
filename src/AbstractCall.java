
public abstract class AbstractCall {
public void videoCall(int phoneNumber)
{
	System.out.println("calling the number "+phoneNumber+" using video call");
}
public void sendTextMsg(String msg , int phoneNumber)
{
	System.out.println("sending the msg "+msg+" to "+phoneNumber);
}
public void call(int phoneNumber)
{
	System.out.println("calling the number "+phoneNumber);
	
}

}
