package d_Classes_And_Interfaces.Item_15_Minimize_mutability;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link MutableClass}
 */
public class MutableClassTest {

	public static final String MY_TITLE = "my_title";
	public static final int ID = 3;
	public static final String SWAPPED_TITLE = "SWAPPED_TITLE";
	MutableClass mutableClass;

	@Before
	public void setup() {
		mutableClass = new MutableClass(MY_TITLE, ID);
	}

	@Test
	public void when__then() {
		//WHEN
		String[] mutableArray = mutableClass.getMutableArray();

		String s = mutableArray[0];
		assertThat(s).isEqualTo(MY_TITLE);
		//THEN
		mutableArray[0] = SWAPPED_TITLE;

		String[] amendedArray = mutableClass.getMutableArray();
		String s1 = amendedArray[0];
		assertThat(s1).isEqualTo(SWAPPED_TITLE);
	}

}