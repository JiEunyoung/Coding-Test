package binarySearch;

public class binarySearch_recursive {

	 public static int binarySearch(int[] arr, int target, int left, int right) {
	        if (left <= right) {
	            int mid = left + (right - left) / 2; 

	            if (arr[mid] == target) {
	                return mid;
	            } else if (arr[mid] < target) {
	                return binarySearch(arr, target, mid + 1, right);
	            } else {
	                return binarySearch(arr, target, left, mid - 1);
	            }
	        }
	        
	        //target�� �迭�� ���� ���
	        return -1;
	    }

	 public static void main(String[] args) {
	        int[] arr = {2, 6, 7, 8, 12, 23, 56, 59, 78};
	        int target = 7;
	        int result = binarySearch(arr, target, 0, arr.length - 1);
	        if (result != -1) {
	            System.out.println(target + "�� �ε���: " + result); //�ε��� 2 ��ȯ
	        } else {
	            System.out.println(target + "�� arr�� �������� ����.");
	        }
	    }
}
