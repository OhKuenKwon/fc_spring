package com.fc.javaoop.service;

import com.fc.javaoop.logic.BubbleSort;
import com.fc.javaoop.logic.JavaSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService ss = new SortService(new BubbleSort<String>());
    @Test
    @DisplayName("SortService 테스트")
    void SortServiceTest(){
        //given

        //when
        List<String> actual = ss.doSort(List.of("3","2","1"));
        //then
        assertEquals(List.of("1","2","3"), actual);
    }
}