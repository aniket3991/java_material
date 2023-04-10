package com.udemy.app;

public class NonOptionalExample {

	/**
	 * NonOptional example as comparison
	 **/

	public static void main(String[] args) {

		Stamp stamp = new Stamp("Barbados");
		//Stamp stamp = null;
		Passport passport = new Passport(stamp);
		//Passport passport = null;
		Person person = new Person("Kevin Smith", passport);
		//Person person = null;

		/**
		 * If person, passport or stamp is null, than NullPointerExecption
		 */
		//System.out.println(person.getPassport().getStamp().getCountryOfStamp());

		String country = "Unknown";
		
		if (person != null) {
			Passport pass = person.getPassport();
			if (pass != null) {
				Stamp st = passport.getStamp();
				if (st != null) {
					country = person.getPassport().getStamp().getCountryOfStamp();
				}
			}
		}
		System.out.println(country);

	}

}
