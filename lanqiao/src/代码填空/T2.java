package 代码填空;

/**
 * 即把一个串从数字不连续的位置断开。试完善之。
 * @author Lenovo
 *
 */
public class T2 {
	public static void main(String[] args) {
		String s = "12345234568923456789";
		String t = "1";
		for(int i=1; i<s.length(); i++)
		{
			if(s.charAt(i)==s.charAt(i-1)+1)
			{
				t += s.charAt(i);
			}	
			else
			{
				System.out.println(t);
				t = "" + s.charAt(i);
			}		
		}
		System.out.println(t);

	}
}
