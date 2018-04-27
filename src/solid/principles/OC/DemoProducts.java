package solid.principles.OC;

import java.util.Arrays;
import java.util.List;

public class DemoProducts {

	public static void main(String[] args) {
		Product flower = new Product("Rose", Colour.RED, Shape.SMALL);
		Product house = new Product("House", Colour.BLUE,Shape.EXTRALARGE);
		Product cloth = new Product("Shirt", Colour.BLUE, Shape.MEDIUM);
		Product tree = new Product("Tree", Colour.GREEN, Shape.LARGE);
		
//		The List.of() method has been implemented in java 9
//		List<Product> productList = List.of(flower,house,cloth,tree);
//		List<Product> productList = Arrays.asList(flower,house,cloth,tree);
		List<Product> productList = List.of(flower,house,cloth,tree);
		
		ProductFilter pf = new ProductFilter();
		System.out.println("Product filter by Colour");
		pf.filterByColour(productList, Colour.BLUE).forEach(e -> System.out.println("-"+e.name+" is Blue"));
		
//		*************************************************************
		/*
		 * Filtering using new implementations
		 * 
		 */
		System.out.println("************************************");
		System.out.println("Filtering using new implementation");
		NewFilter newFilter = new NewFilter();
		newFilter.filter(productList, new ColourSpecification(Colour.BLUE))
					.forEach(e -> System.out.println(" - "+e.name+" is Blue"));
		newFilter.filter(productList, new ShapeSpecification(Shape.LARGE))
					.forEach(e ->System.out.println(" - "+e.name+" is large"));
		
		System.out.println("Filtering two items");
		newFilter.filter(productList, new AndSpecification<>(new ColourSpecification(Colour.GREEN),new ShapeSpecification(Shape.LARGE)))
		            .forEach(e -> System.out.println(" - "+e.name+" is Green and Large"));
					
		            
	}
}
