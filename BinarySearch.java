class BinarySearch
{
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = Math.floorDiv(left + right, 2);
            int midValue = arr[mid];
            if (midValue == target) return mid;
            else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 6, 8, 9, 10 };
        int target = 6;

        int index = search(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
