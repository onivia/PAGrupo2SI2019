/*
 * 6pm_13feb2019__2.cpp
 *
 *  Created on: 13/02/2019
 *      Author: ONivia
 */


#include <iostream>
using namespace std;

int var1 = 10;
const int var2 = 10;
int var3 = 200;

void f1() {
	int var4 = 500;

	var4 += 1;

	cout<<var4<<endl;
}

int main() {
	f1();

	f1();

	return 0;
}


