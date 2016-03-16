package g_Methods.Item_43_Return_empty_arrays_or_collection_not_nulls;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ReturnsNonNulls}
 */
public class ReturnsNonNullsTest {

	ReturnsNonNulls nonNulls;

	@Before
	public void setup() {
		nonNulls = new ReturnsNonNulls();
	}

	@Test
	public void when_emptyListAskedToReturn_thenItIsEmpty() {
		//WHEN
		List<?> objects = nonNulls.returnEmptyList();

		//THEN
		assertThat(objects.size()).isEqualTo(0);
	}

	@Test
	public void when_emptyArrayAskedToReturn_thenItIsEmpty() {
		//WHEN
		Object[] objects = nonNulls.getEmptyArray();

		//THEN
		assertThat(objects.length).isEqualTo(0);
	}

}