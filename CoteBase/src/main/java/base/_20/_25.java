package base._20;

/**
*
* <pre>
* Statements
* </pre>
*
* @ClassName : _25.java
* @Description : Ŭ���� ������ ����մϴ�.
* @version 1.0
* @see
* @Modification Information
* <pre>
* since			: 2021. 8. 5.
* author		: qkrck
* description	: ���ʻ���
* </pre>
*/
public class _25 {

	/**
	 * N�� �־����� �� N�� ����Ŭ�� ���̸� ���Ͻÿ�
	 * @param args
	 */
	public static void main(String[] args) {
		int n 	= 26;
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		do {
			tmp = res/ 10 + res % 10;
			res = res % 10 * 10 + tmp % 10;
			++cnt;
		} while(n != res);
		
		System.out.println(cnt);
		
	}

}
