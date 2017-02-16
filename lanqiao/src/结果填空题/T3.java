package 结果填空题;

/**
 * 某饭店招待国外考察团。
 * 按照标准，对领导是400元/人，随团职员200元/人，对司机50元/人。 考察团共36人，招待费结算为3600元，
 * 请问领导、职员、司机各几人。 
 * 答案是三个整数，用逗号分隔。
 * 
 * @author Lenovo
 *
 */
public class T3 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9;i++ ){
			for(int j = 1; j <=18 ;j++){
				for(int k = 1 ; k <= 72 ;k++){
					if(i+j+k==36&&i*400+j*200+k*50==3600){
						System.out.println(i+","+j+","+k);
					}
				}
			}
		}
	}
}
