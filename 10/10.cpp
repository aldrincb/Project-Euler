#include <iostream>
#include <cmath>

using namespace std;

bool isPrime (int n) {
	for (int i = 2; i <= ceil(sqrt(n)); i ++) {
		if (n % i == 0 && i != n) {
			return false;
		}
	}
	return true;
}

int main(int argc, char *argv[]) {
	
	// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

	// Find the sum of all the primes below two million.
	
	int i = 2;
	long long sum = 0;
	
	while (i < 2000000) {
		if (isPrime(i)) {
			sum += i;
		}
		i++;
	}
	
	cout << sum << endl;
}
