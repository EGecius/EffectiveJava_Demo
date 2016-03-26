package d_Classes_And_Interfaces.Item_18_Prefer_interfaces_to_abstract_classes.AbstractSceletalImplementation;

/**
 * You can combine the virtues of interfaces and abstract classes by providing an abstract skeletal implementation
 * class to go with each nontrivial interface that you export. The interface still defines the type, but the skeletal
 * implementation takes all of the work out of implementing it
 */
abstract class AbstractSceletalImplementation implements MyInterface {

	@Override
	public void doWork() {
		//implementing some methods
		System.out.print("doing work");
	}

}
