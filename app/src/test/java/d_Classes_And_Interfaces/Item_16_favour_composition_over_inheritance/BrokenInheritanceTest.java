package d_Classes_And_Interfaces.Item_16_favour_composition_over_inheritance;

import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link BrokenInheritance}
 */
public class BrokenInheritanceTest {

	BrokenInheritance<String> hashSet;

	@Before
	public void setup() {
		hashSet = new BrokenInheritance<>();
	}

	@Test (expected = ComparisonFailure.class)
	public void when__then() {
		//WHEN
		hashSet.add("one");
		hashSet.add("two");

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("three");
		arrayList.add("four");
		hashSet.addAll(arrayList);

		int addCount = hashSet.getAddCount();
		assertThat(addCount).isEqualTo(4);

	}

}