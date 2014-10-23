class ProjectEuler9 {
	public static void main(String[] args) {
		
		/*
		A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

		a^2 + b^2 = c^2
		For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
		Find the product abc.
		*/
		
		for (int a = 0; a < 1000; a ++) {
			for (int b = 0; b < 1000; b ++) {
				if (isSquare(a*a + b*b) && a + b + Math.sqrt(a*a + b*b) == 1000) {
					System.out.println(a);
					System.out.println(b);
					System.out.println(Math.sqrt(a*a + b*b));
					System.out.println(a*b*Math.sqrt(a*a + b*b));
					break;
				}
			}
		}
		
	}
	
	public static Boolean isSquare (int n) {
		return (Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n)));
	}
}