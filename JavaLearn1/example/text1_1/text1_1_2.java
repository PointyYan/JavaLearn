package text1_1;

public class text1_1_2 {
	 public static void main(String[] args) {
			char today='日';
			switch(today){
			    case '一':
			    case '三':
			    case '五':
			         System.out.println("吃包子");
			         break;
			    case '二':
			    case '四':
			    case '六':
			         System.out.println("吃油条");
			         break;
			    default:
			         System.out.println("吃主席套餐");
			}
			
			int num1=99,q;
			q=num1/100;
			System.out.println(q);
			
	    }
}
