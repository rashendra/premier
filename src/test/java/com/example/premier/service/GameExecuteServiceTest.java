package com.example.premier.service;

import com.example.premier.model.Child;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GameExecuteServiceTest {

	@Test
	public void shouldReturnTheWinnerWhenKIsGreaterThanN() {
		//Given
		int k = 9;
		int n = 7;
		//when
		Child winner = GameExecuteService.executeGame(k, n);
		//Then
		Assertions.assertThat(winner.getId() == 2).isTrue();
	}

	@Test
	public void shouldReturnTheWinnerWhenKIsLessThanN() {
		//Given
		int k = 7;
		int n = 11;
		//when
		Child winner = GameExecuteService.executeGame(k, n);
		//Then
		Assertions.assertThat(winner.getId() == 1).isTrue();
	}


}
