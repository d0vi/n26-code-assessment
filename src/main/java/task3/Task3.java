package task3;

public class Task3 {
    public int solution(int[] A) {
        // use a candidate median as the target angle
        int minCost = Integer.MAX_VALUE;
        // iterate over each unique angle in A as the target angle
        for (int target : A) {
            int cost = 0;
            // calculate the cost for each arrow to rotate to the target
            for (int angle : A) {
                // calculate the minimum rotation distance: rotation = min(|A[K] − T|, 360 − |A[K] − T|)
                int diff = Math.abs(angle - target);
                cost += Math.min(diff, 360 - diff);
            }
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }
}
