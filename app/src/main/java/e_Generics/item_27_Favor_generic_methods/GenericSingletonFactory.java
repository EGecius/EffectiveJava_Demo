package e_Generics.item_27_Favor_generic_methods;

final class GenericSingletonFactory<T> {

	public interface UnaryFunction<T> {
		T apply(T arg);
	}

	private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
		@Override
		public Object apply(final Object arg) {
			return arg;
		}
	};

	@SuppressWarnings ("unchecked") // since the object is stateless and can contain any object, casting is safe
	public static <T> UnaryFunction<T> getIdentityFunction() {
		return (UnaryFunction<T>) IDENTITY_FUNCTION;
	}
}
