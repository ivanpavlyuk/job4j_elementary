package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1To3Then3() {
        int first = 2;
        int second = 1;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To2To5Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}