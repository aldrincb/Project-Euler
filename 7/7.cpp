#include <iostream>
#include <cmath>

using namespace std;
bool isPrime (int n) {
	for (int i = 2; i < n; i ++) {
		if (n % i == 0 && i != n) {
			return false;
		}
	}
	return true;
}

int main(int argc, char *argv[]) {
	
	// The prime factors of 13195 are 5, 7, 13 and 29.

	// What is the largest prime factor of the number 600851475143 ?
	
	long num = 600851475143;
	int sq = ceil(sqrt(num));
	
	while (sq > 1) {
		if (((num % sq) == 0) && isPrime(sq)) {
			cout << sq << endl;
			break;
		}
		sq--;
	}
}

