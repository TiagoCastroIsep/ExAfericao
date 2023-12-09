import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void shouldReturnCorrectResultForMatrix3x2() {
        // Arrange
        int[][] matrix = {
                {0, 0},
                {-2, 1},
                {1, 2},
        };
        int[] expected = {1, -1, 6};
        // Act
        int[] result = Main.getFactorialFromEachMatrixRowSum(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResultForMatrix2x3() {
        // Arrange
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 2},
        };
        int[] expected = {1, 6};
        // Act
        int[] result = Main.getFactorialFromEachMatrixRowSum(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptyArrayForEmptyMatrix() {
        // Arrange
        int[][] matrix = {};
        int[] expected = {};
        // Act
        int[] result = Main.getFactorialFromEachMatrixRowSum(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResultForIrregularMatrix() {
        // since matrix may or may not have always the same number of elements for each row we need this test.
        // Arrange
        int[][] matrix = {
                {0, 0},
                {-2, 1},
                {1},
        };
        int[] expected = {1, -1, 1};
        // Act
        int[] result = Main.getFactorialFromEachMatrixRowSum(matrix);
        assertArrayEquals(expected, result);
    }
}