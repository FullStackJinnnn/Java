//두수의 합
package easy.code.test;

import java.util.Scanner;

public class Solution8 {
	public int solution(int num1, int num2) {
	
	    int add = 0;
        int answer = 0;
        add = num1 + num2;
        answer = add;
        return answer;
}


	public static void main(String[] args){
	    
		Solution8 test = new Solution8();
	    Scanner scan = new Scanner(System.in);
	    System.out.println("첫번째 숫자 입력 :");
	    int num1 = scan.nextInt();
	    System.out.println("두번째 숫자 입력 :");
	    int num2 = scan.nextInt();
	    int answer = 0;
	    answer = test.solution(num1,num2);
	    System.out.println("num1이" + num1 +"이고 num2가 " + num2 +"이므로" + num1 +"+" +num2 + "=" + answer + "를 return합니다" );
	    
	     
	}
}
