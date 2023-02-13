package com.fc.javaoop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("메인 테스트")
    void main() {
        String[] args = {"3", "1", "2"};
        Main.main(args);
    }
}