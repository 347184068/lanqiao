package 编程大题;

/**
 * 
 A、B、C、D、E、F、G、H、I、J 共10名学生有可能参加本次计算机竞赛，也可能不参加。因为某种原因，他们是否参赛受到下列条件的约束：
 * 
 * 1. 如果A参加，B也参加；
 *  2. 如果C不参加，D也不参加； 
 *  3. A和C中只能有一个人参加； 
 *  4. B和D中有且仅有一个人参加；
 *   5. D、E、F、G、H 中至少有2人参加； 
 *   6. C和G或者都参加，或者都不参加； 
 *   7. C、E、G、I中至多只能2人参加 
 *   8. 如果E参加，那么F和G也都参加。 
 *   9. 如果F参加，G、H就不能参加 
 *   10. 如果I、J都不参加，H必须参加
 * 
 * 请编程根据这些条件判断这10名同学中参赛者名单。如果有多种可能，则输出所有的可能情况。每种情况占一行。参赛同学按字母升序排列，用空格分隔。
 * 
 * @author Lenovo
 *
 */
public class T12 {
	
	//a a[1]  b a[2]  c a[3]  d a[4]
	static int book[] = new int[11];
	static int arr[] = new int[11];
	
	//!a->!d
	public static void main(String[] args) {
		dfs(1);
	}
	private static void dfs(int step) {
		// TODO Auto-generated method stub
		if(step==11){
			if(check()){
				for(int i = 1 ; i < arr.length ;i++){
					if(arr[i]==1){
						System.out.print((char)('A'+i-1)+" ");
					}
				}
				System.out.println();
			}
			return;
		}
		
		
		for(int i = 0 ; i <=1 ;i++){
			if(book[step]==0){
				book[step] = 1;
				arr[step] = i;
				dfs(step+1);
				book[step] = 0;
			}
		}
		
		return;
	}
	//// 在数学中a-->b  <==> ~a || b  意思是：如果由a推出b，等价于 非a或b  
//	 * 1. 如果A参加，B也参加；
//	 *  2. 如果C不参加，D也不参加； 
//	 *  3. A和C中只能有一个人参加； 
//	 *  4. B和D中有且仅有一个人参加；
//	 *   5. D、E、F、G、H 中至少有2人参加； 
//	 *   6. C和G或者都参加，或者都不参加； 
//	 *   7. C、E、G、I中至多只能2人参加 
//	 *   8. 如果E参加，那么F和G也都参加。 
//	 *   9. 如果F参加，G、H就不能参加 
//	 *   10. 如果I、J都不参加，H必须参加
	private static boolean check() {
		// TODO Auto-generated method stub
		boolean t1 = (arr[1]==0)||(arr[2]==1);
		boolean t2 = (arr[3]==1)||(arr[4]==0);
		boolean t3 = ((arr[1]+arr[3])<=1);
		boolean t4 = ((arr[2]+arr[4])==1);
		boolean t5 = ((arr[4]+arr[5]+arr[6]+arr[7]+arr[8])>=2);
		boolean t6 = arr[3]==arr[7];
		boolean t7 = arr[3]+arr[5]+arr[7]+arr[9]<=2;
		boolean t8 = (arr[5]==0)||(arr[6]+arr[7]==2);
		boolean t9 = (arr[6]==0)||(arr[7]+arr[8]==0);
		boolean t10 = (arr[9]+arr[10]>0)||(arr[8]==1);
		return t1&&t2&&t3&&t4&&t5&&t6&&t7&&t8&&t9&&t10;
	}

}
