package net.java.launcher;

public class Passenger {
	private String name;
	private double age;
	private boolean survived;
	private String sex;
	private String passengerClass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public boolean isSurvived() {
		return survived;
	}

	public void setSurvived(boolean survived) {
		this.survived = survived;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassengerClass() {
		return passengerClass;
	}

	public void setPassengerClass(String passengerClass) {
		this.passengerClass = passengerClass;
	}

	public Passenger(String name, double age, boolean survived, String sex, String passengerClass) {
		super();
		this.name = name;
		this.age = age;
		this.survived = survived;
		this.sex = sex==null? "male":"female";
		this.passengerClass = passengerClass;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", survived=" + survived + "]";
	}

}
