package f_Enums_And_Annotations.Item_37_Use_marker_interfaces_to_define_types;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class MarkerAnnotations {

	/**
	 * When you have an annotation like this, which targets classes and interfaces, ask yourself if you may be
	 * better off with market annotation instead
	 * */
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	public @interface MyAnnotation{
		String value();
	}
}
