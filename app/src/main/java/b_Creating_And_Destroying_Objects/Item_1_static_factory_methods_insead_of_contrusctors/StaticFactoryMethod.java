package b_Creating_And_Destroying_Objects.Item_1_static_factory_methods_insead_of_contrusctors;

public class StaticFactoryMethod {

	private StaticFactoryMethod() {
	}

	public static StaticFactoryMethod getInstance() {
		return new StaticFactoryMethod();
	}

}
