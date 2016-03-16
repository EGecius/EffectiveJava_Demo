package g_Methods.Item_41_Use_overloading_judiciously;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Shows how overloading may lead to counter-intuitive results. In bellow example {@code satisfy(Collection<?>
 *     collection)} will be called for every passing of ArrayList & HashSet
 */
final class ConfusingOverloading {

	public static final String LIST = "List";
	public static final String SET = "Set";
	public static final String COLLECTION = "Collection";

	String satisfy(List<?> list) {
		return LIST;
	}

	String satisfy(Set<?> set) {
		return SET;
	}

	String satisfy(Collection<?> collection) {
		return COLLECTION;
	}

}
