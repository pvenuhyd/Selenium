package basics;

public class Encapsulation {
	
	private int age;
	private String name;
	private long card;

	public long getCard() {
		return card;
	}

	public void setCard(long card) {
		int length=String.valueOf(card).length();
		if(length!=16){
			throw new IllegalArgumentException("Card must be 16 digits only");	
		}
		this.card = card;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 18 || age > 55) {
	        throw new IllegalArgumentException("Age must be from 18 to 55");
	    }
		this.age = age;
	}
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("name cannot be null or empty!");
		}
		this.name = name;
	}

}
