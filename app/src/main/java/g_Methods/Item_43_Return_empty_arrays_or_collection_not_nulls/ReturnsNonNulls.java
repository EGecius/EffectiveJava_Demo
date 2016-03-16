package g_Methods.Item_43_Return_empty_arrays_or_collection_not_nulls;

import java.util.Collections;
import java.util.List;

/**
 * Shows how to avoid returning nulls
 */
final class ReturnsNonNulls {

	public static final Object[] EMPTY_ARRAY = new Object[0];

	List<?> returnEmptyList() {
		return Collections.emptyList();
	}

	public Object[] getEmptyArray() {
		return EMPTY_ARRAY;
	}
}
