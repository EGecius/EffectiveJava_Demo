package h_GeneralProgramming.Item_49_Prefer_primitive_types_to_boxed_primitives;

@SuppressWarnings("NumberEquality")
final class BoxedPrimitives {

	Integer getInteger(int x) {
		return x;
	}

	Long getLong(long x) {
		return x;
	}

    /** Easy mistake to make - comparison by reference instead of by value */
    boolean compare(Integer value1, Integer value2) {
        return value1 == value2;
    }

}
