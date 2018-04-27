package solid.principles.OC;

public class ShapeSpecification implements Specification<Product>{

	private Shape shape;
	
	public ShapeSpecification(Shape shape) {
		
	    this.shape = shape;
	    
	}
	
	@Override
	public boolean isSatisfied(Product item) {

		return item.shape == shape;
	}

}
