class ProjectEuler16 {
	public static void main(String[] args) {
		
		/*
		2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

		What is the sum of the digits of the number 2^1000?
		*/
		
		long two = 1;
		int sum = 0;
		
		for (int i = 1; i <= 1000; i ++) {
			two *= 2;
			System.out.println(two)	;
					
		}
		
		String number = String.valueOf(two);
		char [] numberArray = number.toCharArray();
		
		for (int i = 0; i < numberArray.length; i ++) {
			sum += Character.getNumericValue(numberArray[i]);
		}
		
		System.out.println(sum)	;
		
	}
}