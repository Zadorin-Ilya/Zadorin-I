public class zadan3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.print("Четные числа: ");
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}
