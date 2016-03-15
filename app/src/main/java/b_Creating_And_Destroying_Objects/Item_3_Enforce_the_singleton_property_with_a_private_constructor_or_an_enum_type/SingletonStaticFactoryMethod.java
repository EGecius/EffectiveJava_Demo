package b_Creating_And_Destroying_Objects.Item_3_Enforce_the_singleton_property_with_a_private_constructor_or_an_enum_type;

public class SingletonStaticFactoryMethod {

	private static SingletonStaticFactoryMethod instance;

	private SingletonStaticFactoryMethod() {
	}

	public static synchronized SingletonStaticFactoryMethod getInstance() {

		if (instance == null) {
			instance = new SingletonStaticFactoryMethod();
		}

		return instance;
	}

}
