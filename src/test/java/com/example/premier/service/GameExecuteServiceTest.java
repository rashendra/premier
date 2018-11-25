package com.example.premier.service;

import com.example.premier.model.Child;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
