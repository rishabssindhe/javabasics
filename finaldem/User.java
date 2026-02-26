package finaldem;
import java.io.*;
public class User implements Serializable {
	String username="Rishab";
	transient String password="1868";
}
class TransientDemo
{
	public static void main(String[] args) throws IOException {
		User user =new User();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("user.ser"));
		oos.writeObject(user);
		oos.close();
	}
}
