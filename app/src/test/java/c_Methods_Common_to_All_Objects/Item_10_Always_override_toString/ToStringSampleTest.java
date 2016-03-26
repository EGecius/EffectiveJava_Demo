package c_Methods_Common_to_All_Objects.Item_10_Always_override_toString;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ToStringSample}
 */
public class ToStringSampleTest {

	ToStringSample sample;

	@Before
	public void setup() {
		sample = new ToStringSample("john", "white");
	}

	@Test
	public void when__then() {
		assertThat(sample.toString()).isEqualTo("ToStringSample{firstName='john', lastName='white'}");
	}

}