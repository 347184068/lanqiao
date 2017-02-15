package 第七届;

/**
 * 凑算式
	     B      DEF
	A + --- + ------- = 10
	     C      GHI   
	（如果显示有问题，可以参见【图1.jpg】） 	 
	这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
	比如：
	6+8/3+952/714 就是一种解法，
	5+3/1+972/486 是另一种解法。
	这个算式一共有多少种解法？
	注意：你提交应该是个整数，不要填写任何多余的内容或说明性文字。
 * @author Lenovo
 *
 */
public class T3 {
	static int count = 0;  
    public static void main(String[] args) {  
        float a[] = new float[10];  
        boolean visit[] = new boolean[10];  
        dfs(a,visit,1);  
        System.out.println(count);  
    }  
  
    private static void dfs(float[] a, boolean[] visit, int num) {  
        if (num==10) {  
            if (judge(a)) {  
                count++;  
            }  
            return;  
        }  
          
        for (a[num] = 1; a[num] < 10; a[num]++) {  
            if (visit[(int) a[num]]==false) {  
                visit[(int) a[num]]=true;  
                num = num + 1;  
                dfs(a, visit, num);  
                num = num - 1;  
                visit[(int) a[num]] = false;  
            }  
        }  
    }  
  
    private static boolean judge(float[] a) {  
        float A = a[1];  
        float B = a[2]/a[3];  
        float C = a[4]*100+a[5]*10+a[6];  
        float D = a[7]*100+a[8]*10+a[9];  
        if (A+B+C/D==10) {  
            return true;  
        }  
        return false;  
    }  
}
