package base._20;

/**
*
* <pre>
* Statements
* </pre>
*
* @ClassName : _21.java
* @Description : Ŭ���� ������ ����մϴ�.
* @version 1.0
* @see
* @Modification Information
* <pre>
* since			: 2021. 8. 4.
* author		: qkrck
* description	: ���ʻ���
* </pre>
*/
public class _21 {

	/**
	 * �ߺ� �� ����
	 * @return
	 */
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
	 * �ߺ��� �� ����
	 * @param args
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
