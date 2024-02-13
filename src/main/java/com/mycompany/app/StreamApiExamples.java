package com.mycompany.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	String pname;
	long pprice;
	long pweight;
	String ptype;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPprice() {
		return pprice;
	}
	public void setPprice(long pprice) {
		this.pprice = pprice;
	}
	public long getPweight() {
		return pweight;
	}
	public void setPweight(long pweight) {
		this.pweight = pweight;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public Product(String pname, long pprice, long pweight, String ptype) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pweight = pweight;
		this.ptype = ptype;
	}
	@Override
	public String toString() {
		return "Product [pname=" + pname + ", pprice=" + pprice + ", pweight=" + pweight + ", ptype=" + ptype + "]";
	}
	
	
	
	
}

public class StreamApiExamples {

	public static void main(String[] args) {
		
		Product p1 = new Product("a", 1000, 200, "t1");
		Product p2 = new Product("b", 2000, 100, "t2");
		Product p3 = new Product("c", 3000, 190, "t3");
		Product p4 = new Product("d", 500, 20, "t4");
		Product p5 = new Product("e", 200, 50, "t5");
		
		ArrayList<Product> allprods = new ArrayList<Product>();
		allprods.add(p1);
		allprods.add(p2);
		allprods.add(p3);
		allprods.add(p4);
		allprods.add(p5);
		
		/**use stream to collect products price greaterthan 1000*/
		
		
		ArrayList hprice=(ArrayList) allprods.stream()
		.filter( product -> product.getPprice() >1000 ).collect(Collectors.toList());
		
		hprice.forEach(System.out::println);
		System.out.println("===============================");
		
		ArrayList sortbyprice=(ArrayList) allprods.stream()
				.sorted(Comparator.comparingLong(Product::getPprice)).collect(Collectors.toList());
		
		sortbyprice.forEach(System.out::println);
		System.out.println("===============================");
		ArrayList sortbyweightAsc = (ArrayList) allprods.stream()
				       .sorted(Comparator.comparingLong(Product::getPweight)).collect(Collectors.toList());
		
		ArrayList sortbyweightDsc = (ArrayList) allprods.stream()
			       .sorted(Comparator.comparingLong(Product::getPweight).reversed()).collect(Collectors.toList());

		sortbyweightAsc.forEach(System.out::println);
		System.out.println("===============================");
		sortbyweightDsc.forEach(System.out::println);
	}

}
