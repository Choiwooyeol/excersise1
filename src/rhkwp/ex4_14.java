package rhkwp;

class Exercise4_14
	{
	public static void main(String[] args){
		int answer = (int)(Math.random() * 100) + 1;
		int input = 0;
		int count = 0; 
		java.util.Scanner s = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1 ��100 ������ ���� �Է��ϼ���"); 
			input = s.nextInt(); 
			if(answer > input) {
				System.out.println("��������"); 
			} else if(answer < input) {
				System.out.println("���� ŭ"); 
			} else {
				System.out.println("����"); 
				System.out.println(count+"ȸ�õ�"); 
				break;}
		} while(true);
	}
}
