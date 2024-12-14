package task1

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Task1Test {
    @Test fun `should return true`() {
        assertTrue { Task1.solution(intArrayOf(1, 1, 2, 3, 3), 3) }
    }

    @Test fun `should return false when at least one number is missing`() {
        assertFalse { Task1.solution(intArrayOf(1, 1, 3), 3) }
    }

    @Test fun `should return false when the K does not equals the last number in the array`() {
        assertFalse { Task1.solution(intArrayOf(1, 1, 2, 3), 2) }
    }
}
