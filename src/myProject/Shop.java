package myProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Shop {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Product p1 = new Product(1,2.0,"Pizza");	
		Product p2 = new Product(2,4.5,"shaorma");	
		Product p3 = new Product(3,5.5,"Cafea");	
		Product p4 = new Product(4,3.25,"Pizza");	
		Product p5 = new Product(5,6.4,"Burger");	
		Product[] products= new Product[] {p1,p2,p3,p4,p5};
		
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Stafiuta\\Desktop\\JavaFileIO.txt"));
//			for(Product p:products) {
			obj.writeObject(p1);
			
//			}
			obj.close();
			
		} catch (FileNotFoundException e2) {
			
			e2.printStackTrace();
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\Stafiuta\\Desktop\\JavaFileIO.txt"));
			for(Product p:products) {
				bf.write("\n");
			 bf.write(p.getName());
			}
			bf.close();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		Food f1 = new Food();
		f1.setP(p5);
		Food f2 = (Food)f1.clone();
		f2.p.setName("omleta");
		
		Product p6 = (Product)p5.clone();
		
		p6.setId(10);
		
	     List<Product> list = new ArrayList<>(List.of(p1,p2,p3,p4,p5));
	     Comparator<Product> c = ( a, b)-> Integer.compare(p1.getId(), p2.getId());
	     Comparator<Product> c1 = ( a, b)->  p1.getId()-p2.getId();
//	     Comparator.comparing( (Product p)->p.id)
//	               .thenComparing(p->p.price)
//	               .thenComparing(p->p.name);
// 	     Collections.sort(list, new criteriaComparable());
//         System.out.println(f1);
//         System.out.println(f2);
//         System.out.println(p5);
//	     System.out.println(p6);
//	     try {
//			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("swap"));
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	     
	    
	}

}
