package j_Concurrency.Item_71_Use_lazy_initialization_judiciously;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link LazyInitForStaticField}
 * In contrary to what item 71, this idiom for lazy initialization for static fields does not work
 */
public class LazyInitForStaticFieldTest {

	@Test
	public void when_outerClassInitialized_thenAllItsFieldsAreInitializedTooEvenBeforeAccessingThem() {
		//WHEN
		boolean initialized = LazyInitForStaticField.hasFieldBeenInitialized;

		assertThat(initialized).isTrue();
	}

	@Test
	public void when_innerClassInitialized_thenAllItsFieldsAreInitializedTooEvenBeforeAccessingThem_2() {
		//WHEN
		boolean initialized = LazyInitForStaticField.FieldHolder.hasFieldBeenInitialized;

		assertThat(initialized).isTrue();
	}

}