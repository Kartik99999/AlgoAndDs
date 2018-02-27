public class BinarySearchByK {
    public static int search(int array[], int value) {
        int left = 0;
        int right = array.length - 1;
        while (left<=right) {
            int mid=left+(right-left)/2;
            if (array[mid] == value) {
                return mid;
            } else if (value < array[mid]) {
                right = mid - 1;
            } else {
                left=mid+1;
            }
        }
        return -1;
    }
}
