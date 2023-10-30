package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int product = j * i;
                boolean ones = false, tens = false, hundreds = false;
                if (product < 10) {
                    sb.append("  ");
                }
                else if (product < 100) {
                    sb.append(" ");
                }
                sb.append(product);
                sb.append(" |");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
