package e_Generics.Item_25_Prefer_lists_to_arrays;

final class ListOverArrays {

	/** Commented out line would not compile. This shows that lists have much stronger type safety */
	void demoListsOverArrays() {
		Object[] objectsArray = new Long[1];
		objectsArray[0] = "I don't fit in"; //fails at runtime

//		ArrayList<Object> list = new ArrayList<Long>(); //fails at compile time because they are incompatible times.
	}
	
	/**
	 * Here in line 1 we pretend that compile would allow creating an array of parameterized lists.
	 * In line 2 this array is assigned to its supertype, which is array of Object types. However, t
	 * his is where the compiler loses track of what types are inside this array. In line 4 it allows
	 * inserting incompatible types to this array of Object, which is actually an array of List<String>.
	 * To prevent this, compiler shows an error in line 1.
	 */
	void test() {
//		List<String>[] arrayListsOfString = new List<String>[3]; //compile error
//		Object[] arrayObjects = arrayListsOfString;
//
//		List<Integer> listIntegers = Arrays.asList(1, 2, 3);
//		arrayObjects[0] = listIntegers;

	}
}
