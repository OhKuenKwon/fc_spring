package com.fc.spring.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    @DisplayName("버블소트 테스트")
    void BubbleSortTest(){
        //given
        BubbleSort<Integer> bs = new BubbleSort<>();
        //when
        List<Integer> actual = bs.sort((List.of(3,2,4,5,1)));
        //then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}