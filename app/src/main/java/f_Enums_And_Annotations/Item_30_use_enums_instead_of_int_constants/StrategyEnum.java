package f_Enums_And_Annotations.Item_30_use_enums_instead_of_int_constants;

/**
 * Demos how to write strategy enum classes
 */
public enum StrategyEnum {

	MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY), FRIDAY
			(PayType.WEEKDAY), SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

	private final PayType payType;

	public double calculateOvertimePay(int hours) {
		return payType.calculateOvertimePay(hours);
	}

	StrategyEnum(PayType payType) {
		this.payType = payType;
	}

	private enum PayType {

		WEEKDAY {
			@Override
			double calculateOvertimePay(double hours) {

				if (hours < shiftHours) {
					return 0;
				} else {
					return (hours - shiftHours) * overtimeRate;
				}
			}
		}, WEEKEND {
			@Override
			double calculateOvertimePay(double hours) {
				return hours * overtimeRate;
			}
		};

		double shiftHours = 8;
		double overtimeRate = 1.5;

		abstract double calculateOvertimePay(double hours);
	}

}
