#include <iostream>
#include <cmath>

using namespace std;

long long triangle (int n) {
	return (n*n + n)/2;
}

int divisors (long long n) {
	int count = 0;
	for (int i = 1; i <= sqrt(n); i ++) {
		if (n % i == 0) {
			count += 2;
		}
	}
	if (sqrt(n) * sqrt(n) == n) {
		count --;
	}
	return count;
}

int main(int argc, char *argv[]) {
	int count = 0;
	while (true) {
		if (divisors(triangle(count)) >= 500) {
			cout << count << endl;
			cout << triangle(count) << endl;
			break;
		}
		count++;
	}
	return 0;
}