package net.java.launcher;

public class TestDMO2 {

	public static void test() {
		Passenger pass = new Passenger(null, 0, false, null, null);
		pass.setName("Abbing, Mr Anthony");
		pass.setSex("male");
		pass.setPassengerClass("2nd");
		pass.setAge(30);
		pass.setSurvived(true);
		System.out.println(pass.toString());
	}

}
