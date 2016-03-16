package g_Methods.Item_44_Write_doc_comments_for_all_exposed_API_elements;

/**
 * Demos how to use parenting
 */
abstract class ParentJavaDocsSample {

	/**
	 * Should be printed in code font & ignores HTML chars: <br>
	 *  {@code |x + y| < |x| + |y|} <br>
	 *
	 * Should NOT be printed in code font & ignores HTML chars: <br>
	 *  {@literal |x + y| < |x| + |y|} <br><br>
	 *
	 * Will not print in code font & wont ignore HTML chars: <br>
	 * |x + y| < |x| + |y|
	 *
	 * @param id id
	 * @throws IllegalArgumentException invalid state
	 *
	 */
	abstract void demoJavaDocs(int id) throws IllegalArgumentException;
}
