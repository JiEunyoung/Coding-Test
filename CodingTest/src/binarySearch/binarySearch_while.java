package binarySearch;

public class binarySearch_while {
	
	public static int binarySearch(int[] arr, int target) {
        int left = 0; // 배열의 왼쪽 끝 인덱스
        int right = arr.length - 1; // 배열의 오른쪽 끝 인덱스

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            //left 값을 더해줘야 배열의 특정 부분에서 중간값 찾을 수 있음

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        //target이 배열에 없는 경우
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