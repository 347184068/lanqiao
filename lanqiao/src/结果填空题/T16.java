package 结果填空题;

/**
 * 16. 猜生日
 * 
 * 今年的植树节（2012年3月12日），小明和他的叔叔还有小伙伴们一起去植树。
 * 休息的时候，小明的同学问他叔叔多大年纪，他叔叔说：“我说个题目，看你们谁先猜出来！”
 *  “把我出生的年月日连起来拼成一个8位数（月、日不足两位前补0）正好可以被今天的年、月、日整除！” 
 *  他想了想，又补充到：“再给个提示，我是6月出生的。” 根据这些信息，请你帮小明算一下，他叔叔的出生年月日。 
 *  答案写在“解答.txt”中，不要写在这里！
 * 
 * 格式是年月日连成的8位数。 例如，如果是1948年6月12日，就写：19480612
 * 
 * @author Lenovo
 *
 */
public class T16 {
	public static void main(String[] args) {
		for(int i = 10000000 ; i <= 99999999; i++){
			String t = i+"";
			String year = t.substring(0,5);
			String month = t.substring(4,6);
			String date = t.substring(6);
			if(month.equals("06")&&Integer.valueOf(date)<=31&&Integer.valueOf(month)<=12&&Integer.valueOf(month)>0){
				if(i%2012==0&&i%3==0&&i%12==0){
					System.out.println(t);
				}
			}
		}
	}
}
