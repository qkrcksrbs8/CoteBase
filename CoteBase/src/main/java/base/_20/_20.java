package base._20;

public class _20 {

	/**
	 * 3, 6, 9 ������ ���ϱ�
	 * @param i
	 * @return
	 */
	public static int getNum(int i) {
		int j = 0;
		while (i > 0) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				++j;
			}
			i /= 10;
		}
		return j;
	}
	
	/**
	 * �ڼ�
	 * @param cnt
	 * @param i
	 */
	public static void getClap(int cnt, int i) {
		if (0 == cnt) {
			System.out.print(i+" ");
		}
		else {
			for (int l = 0; l < cnt; ++l) {
				System.out.println("¦");	
			}
			System.out.println("¦");	
		}
	}
	
	/**
	 * 3, 6, 9
	 */
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i < n; ++i) {
			getClap(getNum(i), i);
		}
	}

}
