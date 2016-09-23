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
			System.out.print("1 과100 사이의 값을 입력하세요"); 
			input = s.nextInt(); 
			if(answer > input) {
				System.out.println("수가작음"); 
			} else if(answer < input) {
				System.out.println("수가 큼"); 
			} else {
				System.out.println("정답"); 
				System.out.println(count+"회시도"); 
				break;}
		} while(true);
	}
}
