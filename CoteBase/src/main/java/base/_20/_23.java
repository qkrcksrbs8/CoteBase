package base._20;

/**
*
* <pre>
* Statements
* </pre>
*
* @ClassName : _23.java
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
public class _23 {

	/**
	 * ���ڿ� ������
	 * @param args
	 */
	public static void main(String[] args) {
		String n = "ABCDEF";
		char str[] = n.toCharArray();
		char tmp;
		int len = str.length;
		
		for (int i = 0; i < len/2; ++i) {
			tmp = str[i];
			str[i] = str[len-i-1];
			str[len-i-1] = tmp;
		}
		
		n = new String(str);
		System.out.println(n);
//		for (int i = 1; i <= n.length(); ++i) {
//			System.out.print(n.charAt(n.length()-i));
//		}
	}

}
