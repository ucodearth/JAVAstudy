import java.util.Calendar;

public class Number {
	public static void main(String[] args) {
		
	    System.out.println("< ���ڿ��� ���İ�� �� >");
		System.out.println("2020-05-10");
		System.out.println(2020-05-10);
		
		System.out.println("< ������Ͽ��� �� �� ��   ���� ���� �������� / ���翬�� / ���� >");
		int birthdate = 20101010;
		int year = birthdate/10000;
		int month = birthdate/100%100;
		int day = birthdate%100;
		int thisYear = Calendar.getInstance().get(Calendar.YEAR);
		int thisMonth = Calendar.getInstance().get(Calendar.MONTH); // 0~11
		int thisDate = Calendar.getInstance().get(Calendar.DATE);
		int age = thisYear - year + 1;
		
		
		
		System.out.println("��� ��: "+year);
		System.out.println("��� ��: " +month);
		System.out.println("��� ��: "+day);
		System.out.println("���翬��: "+thisYear);
		System.out.println("������: "+thisMonth+1); // 0+11
		System.out.println("�������: "+thisDate);
		System.out.println("����: "+age);
	
		
		boolean adult = age >= 20;
		System.out.println(adult);
		System.out.println(true);	
		
		
		
		System.out.println("< ���� ����� �Ҽ������� ���ϱ�  - True >");
		int eng = 80;
		int kor = 85;
		double Aver_decimalBracket = (eng+kor)/2.0;
		double Aver_doubleBracket = (double)(eng+kor)/2;
		System.out.println(Aver_decimalBracket);		
		System.out.println(Aver_doubleBracket);
		
		System.out.println("< ���� ����� �Ҽ������� ���ϱ�  - False >");
		int intAver = eng+kor/2;
		double doubleAver = eng+kor/2;
		double doubleAver_Decimal = eng+kor/2.0;
		System.out.println(intAver);
		System.out.println(doubleAver);
		System.out.println(doubleAver_Decimal);
		
		
        }
    }
