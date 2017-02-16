package 结果填空题;

/**
 * 5. 除去次方数 
 * 自然数的平方数是：1 4 9 16 25 … 
 * 自然数的立方数是：1 8 27 64 125 … 
 * 自然数的4次方数是：1 16 81 256 … … 
 * 这些数字都可以称为次方数。 
 * 1~10000中，去掉所有的次方数，还剩下多少个数字？
 * 
 * @author Lenovo
 *
 */
public class T5 {
	
	public static void main(String[] args) {
		int arr[] = new int[10001];
		for(int i =2 ; i <= 10000 ; i++){
			for(int j = 2 ; j <= Math.sqrt(10000) ;j++){
				if(Math.pow(i, j)>0&&Math.pow(i, j)<=10000){
					arr[(int) Math.pow(i, j)] = 1;
				}
			}
		}
		int count =0;
		for(int i = 1; i < 10001 ;i++){
			if(arr[i]==0){
				count++;
			}
		}
		System.out.println(count-1);
	}
}
