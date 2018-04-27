package solid.principles.OC;

public class ColourSpecification implements Specification<Product>{

	private Colour colour;
	
	public ColourSpecification(Colour colour){
		this.colour = colour;
	}
	@Override
	public boolean isSatisfied(Product item) {

		return item.colour == colour;
	}

}
