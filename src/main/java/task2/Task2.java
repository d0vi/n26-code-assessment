package task2;

public class Task2 {
    public int solution(int[] A) {
        // calculating the frequency of each number in 'A'
        int[] frequency = new int[5];
        for (int number : A) {
            frequency[number]++;
        }

        // finding the median
        int half = A.length / 2;
        int median = 0;
        int cumulative = 0;
        for (int i = 0; i < frequency.length; i++) {
            cumulative += frequency[i];
            if (cumulative > half) {
                median = i;
                break;
            }
        }

        // calculating the total steps needed to make all elements equal (to the median)
        int steps = 0;
        for (int i = 0; i < frequency.length; i++) {
            steps += Math.abs(i - median) * frequency[i];
        }
        return steps;
    }
}
