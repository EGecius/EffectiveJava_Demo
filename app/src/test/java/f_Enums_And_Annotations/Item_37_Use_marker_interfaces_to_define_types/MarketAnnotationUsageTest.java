package f_Enums_And_Annotations.Item_37_Use_marker_interfaces_to_define_types;

import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * Single Responsibility:
 *
 * Tests for {@link MarketAnnotationUsage}
 */
public class MarketAnnotationUsageTest {

	MarketAnnotationUsage classUnderTest;

	@Before
	public void setup() {
		classUnderTest = new MarketAnnotationUsage();
	}

	@Test
	public void when_instantiatingDemoObject_then_markerAnnotationIsFound() {
		//WHEN
		MarketAnnotationUsage.Demo demo = new MarketAnnotationUsage.Demo();

		//THEN
		markerAnnotationIsFound(demo);
	}

	private void markerAnnotationIsFound(MarketAnnotationUsage.Demo demo) {
		boolean passed = false;

		Annotation[] annotations = demo.getClass().getAnnotations();
		for (Annotation annotation : annotations) {
			if (annotation instanceof MarkerAnnotations.MyAnnotation) {
				passed = true;
				break;
			}
		}

		if (!passed) {
			throw new AssertionError("annotation not found");
		}
	}

	@Test
	public void when_instantiatingDemo2Object_then_markerInterfaceFound() {
		//WHEN
		MarketAnnotationUsage.Demo2 demo2 = new MarketAnnotationUsage.Demo2();
		//THEN
		markerInterfaceFound(demo2);
	}

	private void markerInterfaceFound(Object demo2) {

		if (!(demo2 instanceof MarkerInterface)) {
			throw new AssertionError("marker interface not found");
		}
	}

}