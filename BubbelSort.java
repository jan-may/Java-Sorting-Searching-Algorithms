import java.util.Arrays;

public class BubbelSort {
    public static void bublesort(int[] feld){
        // es werden maximal feld.length -1 Durchläufe benötigt
        for(int i = 0; i < feld.length -1; i++) {
            //solange keine Vertauschungen vorgenommen wurden, ist das Feld sortiert.
            boolean sorted = true;
            // durchlaufe das Feld, in jedem Durchlauf muss ein Element weniger berücksichtigt werden.
            for (int j = 0; j < feld.length - 1 - i; j++) {
                if (feld[j] > feld[j + 1]) {
                    int temp = feld[j];
                    feld[j] = feld[j + 1];
                    feld[j + 1] = temp;
                    // feld ist nicht sortiert.
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {4, 35, 23, 5, 2, 67, 45, 21 };
        BubbelSort.bublesort(data);
        System.out.println(Arrays.toString(data));
    }
}
