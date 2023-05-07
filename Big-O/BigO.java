public class BigO{
	// 시간복잡도는 O(N) 배열을 두 번 읽던 한 번 읽던지 big-O 시간을 구할 떄는 아무런 영향을 주지 않는다.
	// 배열의 요소에 따라 실행 시간이 정해진다. O(2N)은 big-O 표기법에선 상수값이 무시된다.
	void foo(int[] arr) {
		int sum = 0; 
		int product = 1;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for(int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		
		System.out.println(sum + ", " + product);
	}
	
	// 시간복잡도는 O(N^2)이다. 안쪽 루프의 반복 횟수는 O(N)이고 이 루프가 N번 반복된다. 
	// 두 원소쌍의 총 개수는 O(N^2)개 이므로 따라서 총 수행 시간은 O(N^2)이 된다.
	void printPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; i++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
	void printUnorderedPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
}
