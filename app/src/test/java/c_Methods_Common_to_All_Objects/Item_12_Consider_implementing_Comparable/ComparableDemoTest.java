package c_Methods_Common_to_All_Objects.Item_12_Consider_implementing_Comparable;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ComparableDemo}
 */
public class ComparableDemoTest {

	@Test
	public void when_ArraysSortCalled_then_objectsSortedFromLowestToHighest() {
		//WHEN
		ComparableDemo instance3 = new ComparableDemo(3);
		ComparableDemo instance0 = new ComparableDemo(0);
		ComparableDemo instance4 = new ComparableDemo(4);
		ComparableDemo instance1 = new ComparableDemo(1);
		ComparableDemo instance2 = new ComparableDemo(2);

		ComparableDemo[] array = {instance3, instance0, instance4, instance1, instance2};

		assertThat(array[0] == instance3);

		Arrays.sort(array);
		//THEN is sorted
		assertThat(array[0] == instance0);
		assertThat(array[1] == instance1);
		assertThat(array[2] == instance2);
		assertThat(array[3] == instance3);
		assertThat(array[4] == instance4);
	}

}