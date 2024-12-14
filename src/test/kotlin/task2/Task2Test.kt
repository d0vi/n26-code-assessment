package task2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Task2Test {
    @Test fun `should return 5 steps`() {
        val steps = Task2().solution(intArrayOf(3, 2, 1, 1, 2, 3, 1))
        assertEquals(5, steps)
    }

    @Test fun `should return 6 steps`() {
        val steps = Task2().solution(intArrayOf(4, 1, 1, 4))
        assertEquals(6, steps)
    }

    @Test fun `should return 0 steps`() {
        val steps = Task2().solution(intArrayOf(3, 3, 3))
        assertEquals(0, steps)
    }
}