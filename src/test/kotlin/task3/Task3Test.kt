package task3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Task3Test {
    @Test fun `should rotate 230 degrees`() {
        val minRotation = Task3().solution(intArrayOf(20, 50, 100, 200))
        assertEquals(230, minRotation)
    }

    @Test fun `should rotate 10 degrees`() {
        val minRotation = Task3().solution(intArrayOf(350, 0, 0))
        assertEquals(10, minRotation)
    }

    @Test fun `should rotate 428 degrees`() {
        val minRotation = Task3().solution(intArrayOf(270, 301, 301, 302, 50, 70, 100))
        assertEquals(428, minRotation)
    }
}