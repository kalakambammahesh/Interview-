import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizableDemo1 implements Serializable{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerilizableDemo1 obj = new SerilizableDemo1();
		System.out.println(obj.hashCode());
		//Serilixing
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kalakambam.mahesh\\Ser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		//deserilizing....
		
		FileInputStream fis = new FileInputStream("C:\\Users\\kalakambam.mahesh");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerilizableDemo1 obj1 = (SerilizableDemo1)ois.readObject();
		System.out.println(obj1.hashCode());
	}
}