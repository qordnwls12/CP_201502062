
public class HW5 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int max=0,min=100;
		for(int i=0;i<10;i++){
			a[i]=(int)(Math.random()*101);
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("10���� �� �� ���� ū ����: "+max);
		System.out.println("10���� �� �� ���� ���� ����: "+min);

	}

}
