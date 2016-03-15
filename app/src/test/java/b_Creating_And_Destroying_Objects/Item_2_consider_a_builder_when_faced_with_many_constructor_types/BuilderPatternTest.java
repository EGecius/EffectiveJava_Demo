package b_Creating_And_Destroying_Objects.Item_2_consider_a_builder_when_faced_with_many_constructor_types;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Tests for {@link BuilderPattern}
 */
public class BuilderPatternTest {

	public static final String EGIS = "Egis";
	public static final String GECIUS = "Gecius";
	public static final String LITHUANIAN = "Lithuanian";
	public static final int AGE = 30;
	BuilderPattern pattern;

	@Before
	public void setup() {
		pattern = new BuilderPattern.Builder()
				.age(AGE)
				.name(EGIS)
				.surname(GECIUS)
				.nationality(LITHUANIAN)
				.build();
	}

	@Test
	public void when_created_then_fieldsSetCorrectly() {
		//WHEN
		//already created
		//THEN
		assertThat(pattern.getName()).isEqualTo(EGIS);
		assertThat(pattern.getSurname()).isEqualTo(GECIUS);
		assertThat(pattern.getAge()).isEqualTo(AGE);
		assertThat(pattern.getNationality()).isEqualTo(LITHUANIAN);

	}

}