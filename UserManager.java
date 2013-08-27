package egen.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserManager {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Address add1=new Address();
		add1.setCity("Dallas");
		add1.setFirstLine("1212 1st street");
		add1.setSecondLine("Apt-111");
		add1.setZip(76010);
		
		User user1=new User();
		user1.setAddress(add1);
		user1.setId(10);
		user1.setUserName("jinu");
		user1.setActive(true);
		
		//serialization
		ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(new File("UserStore")));
		obj.writeObject(user1);
		obj.close();
		obj.close();
		
		//deserialization
		ObjectInputStream ips=new ObjectInputStream(new FileInputStream(new File("UserStore")));
		User u=(User) ips.readObject();
		System.out.println(u.toString());
		ips.close();
	}

}
