package com.example.premier.premier;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class GameExecuterTest {

    @Test
    public void shouldReturnIndexOffsetWhenKIsLessThanN() {
        //Given
        ChildCircle childCircle = new ChildCircle(9);
        int k = 7;
        //when
        int indexOffset = GameExecuter.getIndexOffset(k, childCircle);
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
        int indexOffset = GameExecuter.getIndexOffset(k, childCircle);
        System.out.println(indexOffset);
        //Then
        Assertions.assertThat(indexOffset == 2).isTrue();
    }


}
