public class SearchAlgorithms {

    // Линейлік іздеу
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Бинарлық іздеу (массив сұрыпталған болуы керек)
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11};

        int key = 7;

        System.out.println("Linear Search: " + linearSearch(arr, key));
        System.out.println("Binary Search: " + binarySearch(arr, key));
    }
}
