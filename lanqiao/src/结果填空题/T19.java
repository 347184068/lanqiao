package 结果填空题;

/**
 * 19. 找素数
 * 
 * 素数就是不能再进行等分的整数。比如：7，11。而9不是素数，因为它可以平分为3等份。
 * 一般认为最小的素数是2，接着是3，5，... 
 * 请问，第100002(十万零二)个素数是多少？ 
 * 请注意：“2” 是第一素数，“3” 是第二个素数，依此类推。 
 * 不需要提交源代码，只要写出准确的结果即可！
 * 
 * @author Lenovo
 *
 */
public class T19 {
	
	public static void main(String[] args) {
		boolean[] isPrim = new boolean[100000001];
		for(int i = 0 ; i < isPrim.length ;i++){
			isPrim[i] = true;
		}
		isPrim[1] = false;
		for(int i = 2 ; i*i < isPrim.length ;i++){
			if(isPrim[i]){
				for(int j = 2*i ; j < isPrim.length ;j+=i){
					isPrim[j] = false;
				}
			}
		}
		
		int n = 0;
		for(int i = 2; i < isPrim.length ;i++){
			if(isPrim[i]){
				n++;
				if(n==100002){
					System.out.println(i);
				}
				
			}
		}
	}
}
