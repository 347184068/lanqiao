package 结果填空题;

/**
 * 2. 三人年龄 三个神秘蒙面人来访F博士。 
 * 博士询问他们年龄时，他们说：我们中年龄最小的不超过19岁。我们3人年龄总和为70岁。
 * 且我们三人年龄的乘积是所有可能情况中最大的。 
 * 请帮助F博士计算他们的年龄，从小到大排列，用逗号分开。
 * 
 * @author Lenovo
 *
 */
public class T2 {
	public static void main(String[] args) {
		int Max = Integer.MIN_VALUE;
		int a=0,b=0,c=0;
		for(int i = 19 ;i<70;i++){
			for(int j = 19 ; j < 70 ;j++){
				for(int k =19 ;k <70 ;k++){
					if(i+j+k==70){
						if(Max<=i*j*k){
							Max = i*j*k;
							a = i;
							b = j;
							c = k;
						}
					}
				}
			}
		}
		System.out.println(a+","+b+","+c);
	}

}
