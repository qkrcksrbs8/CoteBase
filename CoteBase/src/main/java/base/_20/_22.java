package base._20;

/**
*
* <pre>
* Statements
* </pre>
*
* @ClassName : _22.java
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
public class _22 {

	public static boolean getCheck(String n, int len) {
		for (int i = 0; i < len/2; ++i) {
			if (n.charAt(i) != n.charAt(len-i-1)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * �Ӹ���� üũ
	 * @param args
	 */
	public static void main(String[] args) {
		String n = "12321";
		System.out.println(getCheck(n, n.length()));
	}

}
