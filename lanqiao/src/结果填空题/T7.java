package 结果填空题;

/**
 * 7. 古堡算式
 * 
 * 福尔摩斯到某古堡探险，看到门上写着一个奇怪的算式： 
 * ABCDE * ? = EDCBA 
 * 他对华生说：“ABCDE应该代表不同的数字，问号也代表某个数字！” 
 * 华生：“我猜也是！” 于是，两人沉默了好久，还是没有算出合适的结果来。 
 * 请你利用计算机的优势，找到破解的答案。 把 ABCDE 所代表的数字写出来。
 * 
 * @author Lenovo
 *
 */
public class T7 {
	
	public static void main(String[] args) {
		for(int n = 1 ; n<=9;n++){
			for(int a1 = 1 ; a1<=9;a1++){
				for(int a2 = 0 ;a2<=9 ;a2++){
					for(int a3 = 0 ; a3<=9;a3++){
						for(int a4 = 0 ; a4<=9;a4++){
							for(int a5 = 1 ;a5<=9 ;a5++){
								if((a1*10000+a2*1000+a3*100+a4*10+a5)*n==(a5*10000+a4*1000+a3*100+a2*10+a1)
										&&a1!=a2&&a1!=a3&&a1!=a4&&a1!=a5&&a2!=a3&&a2!=a4&&a2!=a5&&a3!=a4&&a3!=a5&&a4!=a5){
									System.out.println((a1*10000+a2*1000+a3*100+a4*10+a5));
									return;
								}
							}
						}
					}
				}
			}
		}
	}

}
