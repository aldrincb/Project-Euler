class ProjectEuler4 {
	public static void main(String[] args) {
		// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

		// Find the largest palindrome made from the product of two 3-digit numbers.
		
		int largestPalindrome = 0;
		
		for (int i = 999; i > 100; i --) {
			for (int j = 999; j > 100; j --) {
				
				// Get product
				int product = i*j;
				
				// Check if palindrome
				// Convert to array of characters
				String number = String.valueOf(product);
				char [] charArray = number.toCharArray();
				int a = 0;
				int b = charArray.length - 1;
				
				Boolean isPalindrome = true;
				while (a < b) {
					if (charArray[a] != charArray[b]) {
						isPalindrome = false;
					}
					a ++;
					b --;
				}
				
				if (isPalindrome && largestPalindrome < product) {
					largestPalindrome = product;
					break;
				}
			}
		}
		
		System.out.println(largestPalindrome);
	}
}