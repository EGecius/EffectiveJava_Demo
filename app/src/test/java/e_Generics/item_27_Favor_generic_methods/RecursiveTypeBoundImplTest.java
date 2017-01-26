package e_Generics.item_27_Favor_generic_methods;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link RecursiveTypeBoundImpl}
 */
public class RecursiveTypeBoundImplTest {

	RecursiveTypeBoundImpl sample;

	@Before
	public void setup() {
		sample = new RecursiveTypeBoundImpl();
	}

	@Test
	public void when_Integers() {

		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(10);
		integers.add(5);
		integers.add(7);

		//WHEN
		Integer max = sample.max(integers);

		//THEN
		assertThat(max).isEqualTo(10);
	}

	@Test
	public void when_Characters() {
		//WHEN
		ArrayList<String> characters = new ArrayList<>();

		//THEN
		characters.add("z");
		characters.add("a");
		characters.add("m");
		String max = sample.max(characters);
		assertThat(max).isEqualTo("z");
	}


}