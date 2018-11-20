package com.example.premier.premier;

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
        childCircle = new ChildCircle(numberOfChildren);
        // Then
        Assertions.assertThat(childCircle.getChildren().size() == 17).isTrue();
    }

    @Test
    public void shouldRemoveCurrentElement() {
        //Given
        childCircle = new ChildCircle(17);
        //When
        childCircle.removeCurrent();
        //Then
        Assertions.assertThat(childCircle.getChildren().size() == 16).isTrue();
        Assertions.assertThat(childCircle.getCurrentElement() == 2).isTrue();

    }

    @Test
    public void shouldSetTheSameIndexAfterRemovingAnElement() {
        //Given
        childCircle = new ChildCircle(17);
        //When
        childCircle.removeCurrent();
        //Then
        Assertions.assertThat(childCircle.getCurrentIndex() == 0).isTrue();
    }

    @Test
    public void shouldMoveTheCurrentIndexToNextIndexWhenItIsNotTheLastElement() {
        //Given
        childCircle = new ChildCircle(17);
        //When
        childCircle.moveNext();
        //Then
        Assertions.assertThat(childCircle.getCurrentIndex() == 1).isTrue();
    }

    @Test
    public void shouldMoveTheCurrentIndexToFirstElementWhenItIsTheLastElement() {
        //Given
        childCircle = new ChildCircle(4);
        //When
        childCircle.moveNext();
        childCircle.moveNext();
        childCircle.moveNext();
        childCircle.moveNext();
        //Then
        Assertions.assertThat(childCircle.getCurrentIndex() == 0).isTrue();
    }

    @Test
    public void shouldReturnTheCurrentElement() {
        //Given
        childCircle = new ChildCircle(17);
        //Then
        Assertions.assertThat(childCircle.getCurrentElement() == 1).isTrue();
    }

    @Test
    public void shouldReturnTheFollowingElementAfterRemovingTheCurrent() {
        //Given
        childCircle = new ChildCircle(17);
        //Then
        Assertions.assertThat(childCircle.getCurrentElement() == 1).isTrue();
    }


}
