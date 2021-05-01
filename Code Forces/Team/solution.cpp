#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;

	int ans = 0;

	for(int i = 0; i < n; ++i) {
		int val;
		int sum = 0;
		cin >> val;
		sum += val;
		cin >> val;
		sum += val;
		cin >> val;
		sum += val;
		if(sum >= 2) ans++;
	}

	cout << ans;
	
  return 0;
}
