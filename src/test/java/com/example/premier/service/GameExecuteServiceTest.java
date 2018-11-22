package com.example.premier.service;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GameExecuteServiceTest {

	@Test
	public void shouldReturnIndexOffsetWhenKIsLessThanN() {
		//Given
		ChildCircle childCircle = new ChildCircle(9);
		int k = 7;
		//when
		int indexOffset = GameExecuteService.getIndexOffset(k, childCircle);
		System.out.println(indexOffset);
		//Then
		Assertions.assertThat(indexOffset == 7).isTrue();
	}

	@Test
	public void shouldReturnIndexOffsetWhenKIsGreaterThanN() {
		//Given
		ChildCircle childCircle = new ChildCircle(9);
		int k = 11;
		//when
		int indexOffset = GameExecuteService.getIndexOffset(k, childCircle);
		System.out.println(indexOffset);
		//Then
		Assertions.assertThat(indexOffset == 2).isTrue();
	}


}
