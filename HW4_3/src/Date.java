
public class Date {
	int year;
	int month;
	int day;
	public void printEastern(){
		System.out.println("����� ��¥ ǥ�� : "+year+"."+month+"."+day);
	}
	public void printWestern(){
		System.out.print("�̱��� ��¥ ǥ�� : ");
		switch(month){
		case 1: System.out.print("January ");
		break;
		case 2: System.out.print("Febuary ");
		break;
		case 3: System.out.print("March ");
		break;
		case 4: System.out.print("April ");
		break;
		case 5: System.out.print("May ");
		break;
		case 6: System.out.print("June ");
		break;
		case 7: System.out.print("July ");
		break;
		case 8: System.out.print("August ");
		break;
		case 9: System.out.print("September ");
		break;
		case 10: System.out.print("October ");
		break;
		case 11: System.out.print("November ");
		break;
		case 12: System.out.print("December ");
		break;
		}
		System.out.print(day+", "+year);

	}
}