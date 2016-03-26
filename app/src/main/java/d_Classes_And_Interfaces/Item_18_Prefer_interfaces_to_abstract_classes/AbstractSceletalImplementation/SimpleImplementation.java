package d_Classes_And_Interfaces.Item_18_Prefer_interfaces_to_abstract_classes.AbstractSceletalImplementation;

/**
 * This class, in addition to exported interface it implements, provides simplest possible implementation.
 */
final public class SimpleImplementation implements MyInterface {
	@Override
	public void doWork() {
		System.out.println("do work");
	}

	@Override
	public void doMoreWork() {
		System.out.print("do more work");
	}
}
