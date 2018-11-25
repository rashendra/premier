package com.example.premier.service;

import com.example.premier.model.Child;
import com.example.premier.model.ChildCircle;
import com.example.premier.model.Game;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GameExecuteServiceTest {

	@Test
	public void shouldReturnTheWinnerWhenKIsGreaterThanN() {
		//Given
		int k = 9;
		int n = 7;
		Game childCircle = new ChildCircle();
		//when
		Child winner = GameExecuteService.executeGame(k, n,childCircle);
		//Then
		Assertions.assertThat(winner.getId() == 2).isTrue();
	}

	@Test
	public void shouldReturnTheWinnerWhenKIsLessThanN() {
		//Given
		int k = 7;
		int n = 11;
		Game childCircle = new ChildCircle();
		//when
		Child winner = GameExecuteService.executeGame(k, n,childCircle);
		//Then
		Assertions.assertThat(winner.getId() == 1).isTrue();
	}


}
