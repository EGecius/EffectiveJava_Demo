package e_Generics.Item_23_Dont_use_raw_types_in_new_code;

import java.util.ArrayList;
import java.util.List;

/**
 * Using raw types is not type safe and produces warnings
 */
final class RawTypesDemo {

	/** Raw type */
	List listRaw = new ArrayList();
	List<Object> listGenerified = new ArrayList<>();

	void addToRaw(Object object) {
		listRaw.add(object);
	}

	void addToGenerified(Object object) {
		listGenerified.add(object);
	}

	/**
	 * Shows how trying to assign mismatching type does not compile. Thus, had to be commended out.
	 * This shows that generified objects, even if their type is Object, have compile-time type safety.
	 */
	void showCompilationErrors() {
		listRaw = new ArrayList<String>();
//		listGenerified = new ArrayList<String>();
	}

}
