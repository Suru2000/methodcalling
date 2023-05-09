package methodcalling;
public class Methodcalling {
	public int addition(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}

	public static void main(String[] args) {
			int a = 20;
			int b = 10;
			Methodcalling obj = new Methodcalling();
			int result = obj.addition(a, b);
			System.out.print(result);
		}
}
