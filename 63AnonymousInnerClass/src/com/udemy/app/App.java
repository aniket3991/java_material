package com.udemy.app;

public class App {

	/**
	 * Anonymous Inner Class
	 * 
	 * Anonymous Inner Class created for implementing interface or extending class.
	 **/

	public static void main(String[] args) {
		AbstractClassForAnonymousClass aClass = new AbstractClassForAnonymousClass() {
			@Override
			void showMsg() {
				System.out.println("Hello Anonymous Inner Class extending class!");
			}
		};
		aClass.showMsg();

		/**
		 * It's an example how the code looks like without Anonymous Inner Class. In the background this happens when
		 * Anonymous Inner Class is working with the difference that Java doesn't give name to this class (that's why
		 * it's anonymous)
		 */
		WithoutAnonimous wa = new WithoutAnonimous();
		wa.showMsg();
		
		/**
		 * Anonymous Inner Class implementing Interface
		 */
		
		InterfaceForAnonymousClass aInterface = new InterfaceForAnonymousClass() {
			public void showMsg() {
				System.out.println("Hello Anonymous Inner Class implementing Interface!");
			}
		};
		aInterface.showMsg();
	}
}
