package base._20;

public class _21 {

	public static int[] getArr() {
		int arr[] = new int [101];
		arr[0] 	= 1;
		arr[1] 	= 1;
		arr[2] 	= 1;
		arr[3] 	= 2;
		arr[4] 	= 2;
		arr[5] 	= 3;
		arr[7] 	= 3;
		arr[8] 	= 3;
		arr[9] 	= 3;
		arr[10] = 4;
		arr[11] = 5;
		return arr;
	}
	
	/**
	 * 중복된 수 제거
	 */
	public static void main(String[] args) {

		boolean duplArr[] = new boolean [101];
		int arr[] = getArr();
		
		for (int i = 1; i <= 100; ++i) {
			duplArr[arr[i]] = true;
		}
		
		for (int i = 1; i <= 100; ++i) {
			if (duplArr[i]) {
				System.err.println(i+" ");
			}
		}
	}

}
