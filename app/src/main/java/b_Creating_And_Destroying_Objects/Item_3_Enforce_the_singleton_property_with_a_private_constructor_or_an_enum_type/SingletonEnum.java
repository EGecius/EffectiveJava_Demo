package b_Creating_And_Destroying_Objects.Item_3_Enforce_the_singleton_property_with_a_private_constructor_or_an_enum_type;

public enum  SingletonEnum {

	INSTANCE(Constants.MY_TITLE);

	private String title;

	SingletonEnum(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}


	public static class Constants {
		public static final String MY_TITLE = "my_title";
	}
}
