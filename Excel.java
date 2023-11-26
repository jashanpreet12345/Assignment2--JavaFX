public class Excel {

    public static double calculateTotal(double[] values) {
        double total = 0;
        for (double value : values) {
            total += value;
        }
        return total;
    }

    public static double calculateAverage(double[] values) {
        if (values.length == 0) {
            return 0;
        }
        return calculateTotal(values) / values.length;
    }

    public static double calculateMaximum(double[] values) {
        if (values.length == 0) {
            return 0;
        }
        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static double calculateMinimum(double[] values) {
        if (values.length == 0) {
            return 0;
        }
        double min = values[0];
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
