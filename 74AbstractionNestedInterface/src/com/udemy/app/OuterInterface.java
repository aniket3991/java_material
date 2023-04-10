package com.udemy.app;

/**
 * Nested Interface in Interface
 * 
 * Nested interfaces are static by default. You don’t have to mark them static explicitly as it would be
 * redundant.
 * Nested interfaces declared inside class can take any access modifier, however nested interface declared
 * inside interface is public implicitly.
 */

public interface OuterInterface {

	public void messageOut();

	public interface NestedInterface {

		public void messageIn();
	}
}
