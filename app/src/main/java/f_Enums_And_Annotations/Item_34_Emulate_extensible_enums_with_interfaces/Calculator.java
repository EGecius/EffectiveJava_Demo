package f_Enums_And_Annotations.Item_34_Emulate_extensible_enums_with_interfaces;

enum Calculator implements Operation {

	ADD() {
		@Override
		public float apply(final int arg1, final int arg2) {
			return arg1 + arg2;
		}
	},
	SUBTRACT() {
		@Override
		public float apply(final int arg1, final int arg2) {
			return arg1 - arg2;
		}
	},
	MULTIPLY() {
		@Override
		public float apply(final int arg1, final int arg2) {
			return arg1 * arg2;
		}
	},
	DIVIDE() {
		@Override
		public float apply(final int arg1, final int arg2) {
			return (float) arg1 / arg2;
		}
	}


}
