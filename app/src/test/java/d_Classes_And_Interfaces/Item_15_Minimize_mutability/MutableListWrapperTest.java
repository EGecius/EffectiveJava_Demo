package d_Classes_And_Interfaces.Item_15_Minimize_mutability;


import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link MutableListWrapper}
 */
public class MutableListWrapperTest {

	public static final String ORIGINAL_VALUE = "original_value";
	public static final String NEW_VALUE = "new value";
	MutableListWrapper wrapper;
	private ArrayList<String> list;

	@Before
	public void setup() {
		list = new ArrayList<>();
		list.add(ORIGINAL_VALUE);
		wrapper = new MutableListWrapper(list);
	}

	@Test (expected = ComparisonFailure.class)
	public void when_constructorInjectedListAmended_then_immutabilityFails() {
		//WHEN
		list.remove(0);
		list.add(NEW_VALUE);

		//THEN
		String foundValue = wrapper.getList().get(0);
		assertThat(foundValue).isEqualTo(ORIGINAL_VALUE);
	}

}