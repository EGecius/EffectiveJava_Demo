package f_Enums_And_Annotations.Item_37_Use_marker_interfaces_to_define_types;

/**
 * Shows how to user marker annotations
 */
public class MarketAnnotationUsage {

	/** For a simple use like this you probably want a marker annotation */
	@MarkerAnnotations.MyAnnotation (value = "my_value")
	public static class Demo {

	}

	/** A simple solution for classes is use of market interface */
	public static class Demo2 implements MarkerInterface {

	}

}
