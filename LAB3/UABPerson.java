
public class UABPerson {

	private String name;
    private String gender;
    private int age;
    private String blazer;

    public UABPerson (String name, String gender, int age, String blazer) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.blazer = blazer;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBlazer() {
		return blazer;
	}
	public void setBlazer(String blazer) {
		this.blazer = blazer;
	}

	public boolean checkPalindrome() {
		String name = this.name;
		int length = name.length();
		for (int i = 0; i < length / 2; i++) {
			if (name.charAt(i) != name.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public int yearsToRetirement() {
		int age = this.age;
		if (age < 65) {
			return 65 - age;
		} else {
			return 0;
		}
	}

	public String toString() {
		return this.name + " is a " + this.age + " year old.";
	}
}
