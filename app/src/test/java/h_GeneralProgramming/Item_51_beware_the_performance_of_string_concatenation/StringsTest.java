package h_GeneralProgramming.Item_51_beware_the_performance_of_string_concatenation;

import org.junit.Before;
import org.junit.Test;

/**
 * Shows how increasing number of times makes time taken grow exponentially, i.e. if you increase twice, seems to
 * take four more times.
 */
public class StringsTest {

	Strings strings;

	@Before
	public void setup() {
		strings = new Strings();
	}

	@Test
	public void when_concatenateTenThousandTimes_then_takes0_12sec() {
		//WHEN
		strings.concatenate(10000);
	}

	@Test
	public void when_concatenateTwentyThousandTimes_then_takes0_4sec() {
		//WHEN
		strings.concatenate(20000);
	}

	@Test
	public void when_concatenateFortyThousandTimes_then_takes3sec() {
		//WHEN
		strings.concatenate(80000);
	}

	@Test
	public void when_addViaStringBuilderTenThousandTimes_then_takes0_02sec() {
		//WHEN
		strings.addViaStringBuilder(10000);
	}

	@Test
	public void when_addViaStringBuilderTwentyThousandTimes_then_takes0_02sec() {
		//WHEN
		strings.addViaStringBuilder(20000);
	}

	@Test
	public void when_addViaStringBuilderFortyThousandTimes_then_takes0_02sec() {
		//WHEN
		strings.addViaStringBuilder(40000);
	}

	@Test
	public void when_addViaStringBuilderMillionTimes_then_takes0_03sec() {
		//WHEN
		strings.addViaStringBuilder(1000000);
	}

}