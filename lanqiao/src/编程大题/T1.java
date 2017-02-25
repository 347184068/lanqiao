package 编程大题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 任意一个5位数，比如：34256，把它的各位数字打乱，重新排列，可以得到一个最大的数：65432，一个最小的数23456。
 * 求这两个数字的差，得：41976，把这个数字再次重复上述过程（如果不足5位，则前边补0）。
 * 如此往复，数字会落入某个循环圈（称为数字黑洞）。
 * 比如，刚才的数字会落入：[82962, 75933, 63954, 61974] 这个循环圈。
 * 
 * 请编写程序，找到5位数所有可能的循环圈，并输出，每个循环圈占1行。其中5位数全都相同则循环圈为 [0]，这个可以不考虑。
 * 
 * 循环圈的输出格式仿照： [82962, 75933, 63954, 61974]
 * 
 * 其中数字的先后顺序可以不考虑。
 * 
 * @author Lenovo
 *
 */
public class T1 {

	static List circles = new ArrayList();
	
	static Set set = new HashSet();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 10000 ; i <= 99999 ;i++){
			if(i!=11111||i!=22222||i!=33333||i!=44444||i!=55555||i!=66666||i!=77777||i!=88888||i!=99999){
				circle(i+"");
				set.add(Arrays.toString(circles.toArray()));
				circles.clear();
			}else{
				set.add("[0]");
			}
		}
		for(Object o : set){
			
			System.out.println(o);
		}
	}

	private static void circle(String i) {
		List<Integer> list = new ArrayList<Integer>();
		char[] array = i.toCharArray();
		for(char t : array){
			list.add(t-'0');
		}
		Collections.sort(list);
		int max = get(1,list);
		int min = get(2,list);
		int subs = max - min;
		int count = count(subs);
		String temp = null ;
		if(count!=5){
			temp = "0"+subs;
		}else{
			temp = subs+"";
		}
		if(circles.contains(temp)){
			int index = circles.indexOf(temp);
			for(int j = 0 ; j < index ;j++){
				circles.remove(0);
			}
			return ;
		}else{
			circles.add(temp);
			circle(temp);
		}
		
	}

	private static int count(int subs) {
		// TODO Auto-generated method stub
		int res =0;
		while(subs!=0){
			subs/=10;
			res++;
		}
		return res;
	}

	private static int get(int i,List<Integer> list) {
		// TODO Auto-generated method stub
		String res = "";
		if(i==1){
			for(int j = list.size()-1 ; j >=0 ;j--){
				res += list.get(j);
			}
		}else if(i==2){
			for(int t : list){
				res+=t;
			}
		}
		return Integer.parseInt(res);
	}

}
