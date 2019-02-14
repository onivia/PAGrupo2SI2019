//============================================================================
// Name        : 6pm_13feb2019_1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void f1(int n) {
	n += 1;
}

void f2(int n[]) {
	n[0] += 1;
}


int main2() {
	int n1 = 10;
	int n2[] = {20};

	f1(n1);
	cout<<n1<<endl; //juan pablo:11, juan carlos: 10

	f2(n2);
	cout<<n2[0]<<endl; //laura: 20, mario: 21

	return 0;
}
