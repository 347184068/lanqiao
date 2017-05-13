package 第七届决赛;

public class T1 {
	public static void main(String[] args) {
		double a=0,b=1000;  
        while(b>=1){  
            b = b-20*(b/60);  
            System.err.println(b);  
            a++;  
        }  
        System.out.println(a/2); 
	}
}
