package com.example.premier.service;

import com.example.premier.model.Child;
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
		//Then
		Assertions.assertThat(indexOffset == 2).isTrue();
	}

	@Test
	public void shouldReturnTheWinnerForTheGivenK() {
		//Given
		int k = 9;
		int n = 7;
		//when
		Child winner = GameExecuteService.executeGame(k, n);
		System.out.println(winner.getId());
		//Then
		Assertions.assertThat(winner.getId() == 2).isTrue();
	}


}
