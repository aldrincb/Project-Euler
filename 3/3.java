class ProjectEuler3 {
	public static void main(String[] args) {
		// The prime factors of 13195 are 5, 7, 13 and 29.

		// What is the largest prime factor of the number 600851475143 ?
		int num = 600851475143;
		int i = 2;
		
		while (i <= num) {
			if (i % num == 0 && isPrime(i)) System.out.println(i);
			i++;
		}
	}
	
	public static Boolean isPrime (int n) {
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0 && i != n) return false;
	    }
	    return true;
	}
}