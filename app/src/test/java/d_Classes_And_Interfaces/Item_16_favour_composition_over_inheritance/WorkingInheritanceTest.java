package d_Classes_And_Interfaces.Item_16_favour_composition_over_inheritance;

import org.junit.Before;
import org.junit.ComparisonFailure;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link WorkingInheritance}
 */
public class WorkingInheritanceTest {

	WorkingInheritance<String> set;

	@Before
	public void setup() {
		set = new WorkingInheritance<>(new HashSet<String>());
	}

	/** Unlike identical test in {@link BrokenInheritanceTest} this ones does not throw {@link ComparisonFailure} */
	@Test
	public void when__then() {
		//WHEN
		set.add("one");
		set.add("two");

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("three");
		arrayList.add("four");
		set.addAll(arrayList);

		int addCount = set.getAddCount();
		assertThat(addCount).isEqualTo(4);
	}

}