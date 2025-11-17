public class ArrayActivity {
    public static void main(String[] args) {
        int[] score = {72, 85, 90, 78, 99, 92, 88, 75, 82, 74};

        int first = score[0];
        int last = score[score.length - 1];

        int lowest = score[0];
        int highest = score[0];

        for (int i = 1; i < score.length; i++) {
            if (score[i] < lowest) {
                lowest = score[i];
            }
            if (score[i] > highest) {
                highest = score[i];
            }
        }

        System.out.println("First element: " + first);
        System.out.println("Lowest element: " + lowest);
        System.out.println("Highest element: " + highest);
        System.out.println("Last element: " + last);
        System.out.println();

        System.out.println("With index:");
        for (int i = 0; i < score.length; i++) {
            System.out.println("Index [" + i + "]: " + score[i]);
        }
        System.out.println();

        System.out.println("Values only:");
        for (int value : score) {
            System.out.println(value);
        }
        System.out.println();


        int sum = 0;
        for (int value : score) {
            sum += value;
        }
        double average = (double) sum / score.length;

        System.out.println("Average score: " + average);
    }
}
