import java.util.Calendar;

public class Number {
	public static void main(String[] args) {
		
	    System.out.println("< 문자열과 수식계산 비교 >");
		System.out.println("2020-05-10");
		System.out.println(2020-05-10);
		
		System.out.println("< 생년월일에서 연 월 일   숫자 각각 가져오기 / 현재연도 / 나이 >");
		int birthdate = 20101010;
		int year = birthdate/10000;
		int month = birthdate/100%100;
		int day = birthdate%100;
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int thisMonth = Calendar.getInstance().get(Calendar.MONTH); // 0~11
		int thisDate = Calendar.getInstance().get(Calendar.DATE);
		int age = thisYear - year + 1;
		
		
		
		System.out.println("출생 년: "+year);
		System.out.println("출생 월: " +month);
		System.out.println("출생 일: "+day);
		System.out.println("현재연도: "+thisYear);
		System.out.println("현재몇월: "+thisMonth+1); // 0+11
		System.out.println("현재몇일: "+thisDate);
		System.out.println("나이: "+age);
	
		
		boolean adult = age >= 20;
		System.out.println(adult);
		System.out.println(true);	
		
		
		
		System.out.println("< 과목 평균을 소수점까지 구하기  - True >");
		int eng = 80;
		int kor = 85;
		double Aver_decimalBracket = (eng+kor)/2.0;
		double Aver_doubleBracket = (double)(eng+kor)/2;
		System.out.println(Aver_decimalBracket);		
		System.out.println(Aver_doubleBracket);
		
		System.out.println("< 과목 평균을 소수점까지 구하기  - False >");
		int intAver = eng+kor/2;
		double doubleAver = eng+kor/2;
		double doubleAver_Decimal = eng+kor/2.0;
		System.out.println(intAver);
		System.out.println(doubleAver);
		System.out.println(doubleAver_Decimal);
		
		
        }
    }
