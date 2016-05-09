import java.util.ArrayList;

public class PrimeNumber {

	public static int PrimeNumberMethod(int x) {
		ArrayList<Integer> prime = new ArrayList<>();
		int max = x * 1000;
		for (int i = 1; i < max; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					isPrime = false;
			}
			if (isPrime)
				prime.add(i);
		}
		return prime.get(x);
	}

	public static void main(String[] args) {
		System.out.println(PrimeNumberMethod(1));

	}
}
