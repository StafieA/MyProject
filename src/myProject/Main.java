package myProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ObjectInputStream obj = new ObjectInputStream(new FileInputStream("C:\\Users\\Stafiuta\\Desktop\\JavaFileIO.txt"));

			Product p = (Product)obj.readObject();
			    obj.close();
			
		} catch (FileNotFoundException e2) {
			
			e2.printStackTrace();
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		System.out.println();
	}
         pula

}
