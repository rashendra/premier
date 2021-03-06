package com.example.premier.model;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ChildCircleTest {

	private ChildCircle childCircle;

	@Before
	public void setUp() {

	}

	@Test
	public void shouldInitializeGivenNumberOfChildren() {
		//Given
		int numberOfChildren = 17;
		childCircle = new ChildCircle();
		childCircle.initializeChildren(numberOfChildren);
		// Then
		Assertions.assertThat(childCircle.getNumberOfChildren() == 17).isTrue();
	}

	@Test
	public void shouldReturnTheCurrentElement() {
		//Given
		childCircle = new ChildCircle();
		childCircle.initializeChildren(17);
		//Then
		Assertions.assertThat(childCircle.getCurrentChildId() == 1).isTrue();
	}

	@Test
	public void shouldReturnTheNextElementAfterRemovingTheCurrent() {
		//Given
		childCircle = new ChildCircle();
		childCircle.initializeChildren(17);
		//when
		childCircle.removeChild(1);
		//Then
		Assertions.assertThat(childCircle.getCurrentChildId() == 2).isTrue();
	}

	@Test
	public void shouldRemoveChildForCalculatedIndexWhenKIsLessThanN() {
		// Given  K<n
		childCircle = new ChildCircle();
		childCircle.initializeChildren(8);
		//When
		childCircle.removeChild(5);
		// Them
		Assertions.assertThat(childCircle.getNumberOfChildren() == 7).isTrue();
		Assertions.assertThat(childCircle.getCurrentIndex() == 4).isTrue();
	}

	@Test
	public void shouldRemoveChildForCalculatedIndexWhenKIsGreaterThanN() {
		// Given
		// K= 14
		// n= 3
		childCircle = new ChildCircle();
		childCircle.initializeChildren(3);
		//When
		childCircle.removeChild(11);
		// Them
		Assertions.assertThat(childCircle.getNumberOfChildren() == 2).isTrue();
		Assertions.assertThat(childCircle.getCurrentIndex() == 1).isTrue();
	}


	@Test
	public void shouldRemoveTheLastChildWhenKEqualsToN() {
		// Given
		// K= 5
		// n= 5
		childCircle = new ChildCircle();
		childCircle.initializeChildren(5);
		//When
		childCircle.removeChild(5);
		// Them
		Assertions.assertThat(childCircle.getNumberOfChildren() == 4).isTrue();
		Assertions.assertThat(childCircle.getCurrentIndex() == 0).isTrue();
	}


}
