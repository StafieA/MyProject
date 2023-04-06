package myProject;

import java.io.Serializable;

public class Product implements Comparable<Product>,Cloneable,Serializable{
   private int id;
 private double price;
   private String name;
   
   
public Product(int id, double price, String name) {
	
	this.id = id;
	this.price = price;
	this.name = name;
}
//public Product() {
//	}
@Override
public int compareTo(Product o) {
	
	return   (int) (this.getPrice()-o.getPrice());
}
public int getId() {
	return id;
}
public double getPrice() {
	return price;
}
public String getName() {
	return name;
}

public void setId(int id) {
	this.id = id;
}
public void setPrice(double price) {
	this.price = price;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Product = [id=" + id + ", price=" + price + ", name=" + name +  "]" ;
}
public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}
