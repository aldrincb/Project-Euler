class ProjectEuler5 {
	public static void main(String[] args) {
		
		// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

		// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
		int i = 0;
		while (true) {
			i ++;
			Boolean isNotEvenlyDivisible = false;
			for (int j = 1; j <= 20; j ++) {
				if (Math.floor((double)i/j) != Math.ceil((double)i/j)) {
					isNotEvenlyDivisible = true;
					break;
				}
			}
			if (!isNotEvenlyDivisible) {
				System.out.println(i);
				break;
			}
		}
	}
	
}