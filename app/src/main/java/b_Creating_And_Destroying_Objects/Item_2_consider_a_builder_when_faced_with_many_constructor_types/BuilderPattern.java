package b_Creating_And_Destroying_Objects.Item_2_consider_a_builder_when_faced_with_many_constructor_types;


public class BuilderPattern {

	private final String name;
	private final String surname;
	private final int age;
	private final String nationality;

	private BuilderPattern(Builder builder) {
		name = builder.name;
		surname = builder.surname;
		age = builder.age;
		nationality = builder.nationality;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	public String getNationality() {
		return nationality;
	}

	public static class Builder {

		private String name;
		private String surname;
		private int age;
		private String nationality;

		Builder name(String name) {
			this.name = name;
			return this;
		}


		Builder surname(String surname) {
			this.surname = surname;
			return this;
		}

		Builder age(int age) {
			this.age = age;
			return this;
		}

		Builder nationality(String nationality) {
			this.nationality = nationality;
			return this;
		}

		BuilderPattern build() {
			return new BuilderPattern(this);
		}


	}
}
