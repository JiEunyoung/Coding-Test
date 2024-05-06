package binarySearch;

public class binarySearch_while {
	
	public static int binarySearch(int[] arr, int target) {
        int left = 0; // �迭�� ���� �� �ε���
        int right = arr.length - 1; // �迭�� ������ �� �ε���

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            //left ���� ������� �迭�� Ư�� �κп��� �߰��� ã�� �� ����

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        //target�� �迭�� ���� ���
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}