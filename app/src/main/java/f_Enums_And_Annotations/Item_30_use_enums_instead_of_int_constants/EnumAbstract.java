package f_Enums_And_Annotations.Item_30_use_enums_instead_of_int_constants;

/**
 * Enum with abstract method
 */
public enum EnumAbstract {

	ADD("+"){
		@Override
		double apply(int x, int y) {
			return x + y;
		}
	},
	SUBTRACT("-") {
		@Override
		double apply(int x, int y) {
			return x - y;
		}
	}, MULTIPLY("*") {
		@Override
		double apply(int x, int y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		double apply(int x, int y) {
			return x / y;
		}
	};

	private final String symbol;

	EnumAbstract(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	abstract double apply(int x, int y);

}
