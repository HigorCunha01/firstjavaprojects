package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, in, out, x;
		
		n = sc.nextInt();
		in = 0;
		out = 0;
		x = 0;
		
		for (int i = 0 ; i<n ; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += +1;
			}
			else {
				out += +1;
			}
		}
		System.out.printf("%d In%n", in);
		System.out.printf("%d out", out);		
		
		sc.close();
	}

}
