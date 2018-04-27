package solid.principles.OC;

public interface Specification<T> {

	public boolean isSatisfied(T item);
}
