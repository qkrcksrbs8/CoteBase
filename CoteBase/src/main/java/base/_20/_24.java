package base._20;

/**
*
* <pre>
* Statements
* </pre>
*
* @ClassName : _24.java
* @Description : 클래스 설명을 기술합니다.
* @version 1.0
* @see
* @Modification Information
* <pre>
* since			: 2021. 8. 5.
* author		: qkrck
* description	: 최초생성
* </pre>
*/
public class _24 {

	/**
	 * 평균 넘는 값 구하기
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {7, 100, 95, 90, 80, 70, 60, 50};
		int arrCnt = arr.length;
		int sum = 0;	
		for (int i = 0; i < arrCnt; ++i) {
			sum += arr[i];
		}
		double avg = (double)sum / arr[0];	
		System.out.println(avg);
		int cnt = 0;
		for (int i = 1; i < arrCnt; ++i) {
			if (avg < arr[i]) {
				++cnt;
			}
		}
		System.out.println(cnt/(double)arr[0] * 100);
		
	}

}
