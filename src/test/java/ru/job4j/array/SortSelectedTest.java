package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf325ThenArrayOf235() {
        int[] data = new int[] {3, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayOf34125107869ThenArrayOf12345678910() {
        int[] data = new int[] {3, 4, 1, 2, 5, 10, 7, 8, 6, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}