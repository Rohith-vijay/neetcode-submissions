
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;

        // Pair each car's position with its time to reach the target
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            // Time = (target - position) / speed
            cars[i][1] = (double) (target - position[i]) / speed[i];
        }

        // Sort cars based on their starting positions in ascending order
        Arrays.sort(cars, (a, b) -> Double.compare(a[0], b[0]));

        int fleets = 0;
        double currentSlowestTime = 0.0;

        // Iterate backwards from the car closest to the target
        for (int i = n - 1; i >= 0; i--) {
            double timeToTarget = cars[i][1];

            // If this car takes strictly longer than the fleet ahead,
            // it cannot catch up. It forms a brand-new fleet.
            if (timeToTarget > currentSlowestTime) {
                fleets++;
                currentSlowestTime = timeToTarget; // This car becomes the bottleneck for cars behind it
            }
            // If timeToTarget <= currentSlowestTime, it catches up to the fleet ahead
            // and becomes part of that fleet (no fleet count increase).
        }

        return fleets;
    }
}