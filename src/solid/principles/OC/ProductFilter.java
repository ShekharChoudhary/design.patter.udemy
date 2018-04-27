package solid.principles.OC;

import java.util.List;
import java.util.stream.Stream;

/**
 * Here since we have only two criteria so we can easily use this way of implementation but if we had more than two criteria
 * and we wanted filter on all the criteria then every time we added a new criteria we had to modify this class.
 * Hence this is a wrong way of implementation.
 * The application is being modified every time and hence it does not follow the rule of Open Close Principle.
 * The application should be open for extension and close for modification
 * Hence we create two new interfaces:-
 * -- Specification
 * -- Filter
 * Then we implement these interfaces to create classes for the specifications and also filters based on our requirements.
 * 
 * @author choudshe
 *
 */
public class ProductFilter {

	public Stream<Product> filterByColour(List<Product> products, Colour colour){
		return products.stream().filter(p-> p.colour == colour);
	}
	
	public Stream<Product> filterByShape(List<Product> products, Shape shape){
		return products.stream().filter(p-> p.shape == shape);
	}
	
	public Stream<Product>filterByNameAndShape(List<Product> products, Shape shape, Colour colour){
		return products.stream().filter(p->p.shape==shape && p.colour == colour);
	}
}
