#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    // diff methods of swap

    // 1. swap inbuilt fn
    // int a = 5, b = 6;
    // swap(a, b);
    // cout << "a: =" << a << ", b:" << b << endl;

    // 2. temp variable
    // int a = 5, b = 6;
    // int temp = a; // temp will be 5
    // a = b; // a will be 6
    // b = temp; // b will be 5
    // cout << "a: =" << a << ", b:" << b << endl;

    // 3. arithematic method, interview question????????
    // int a = 5, b = 6;
    // a = a + b; // sum of a and b stored in a, a = 11, b = 6;
    // b = a - b; // subtracting b from new a gives initial value of a,, a = 11, b = 5
    // a = a - b; // subtract new b from new a gives initial value of b... a = 6, b = 5
    // cout << "a:" << a << ", b:" << b << endl;

    // 4. XOR bitwise method, interview question????????
    int a = 5, b = 6;
    a = a ^ b;
    b = b ^ a;
    a = a ^ b;
    cout << "a:" << a << ", b:" << b << endl;
    return 0;
}