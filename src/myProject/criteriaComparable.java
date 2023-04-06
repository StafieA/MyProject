package myProject;

import java.util.Comparator;

public class criteriaComparable implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		int i = (o1.getName()).compareTo(o2.getName());
		  if(i!= 0)
			  return i;
		  
		  return (int) (o1.getPrice()-o2.getPrice());
		  
	}

}
