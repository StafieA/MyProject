package myProject;

public class Food implements Cloneable {
   Product p = new Product();

public Product getP() {
	return p;
}

public void setP(Product p) {
	this.p = p;
}
public Object clone() throws CloneNotSupportedException {

	Food cloned=  (Food)super.clone();
	cloned.setP((Product)cloned.getP().clone());
//	f.p = new Product();
      return cloned;
}

@Override
public String toString() {
	return "Food [p=" + p + "]";
}

}
