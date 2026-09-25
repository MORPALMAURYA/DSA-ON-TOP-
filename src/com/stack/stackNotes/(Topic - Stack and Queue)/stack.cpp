#include<iostream>
using namespace std;

class Stack
{
    int top;
    int a[100];

    public :
        Stack()
        {
            top = -1;
        }

        void push(int x)
        {
            if(top == 99)
            {
                cout<<"Stack Overflow"<<endl;
            }
            else{
                top++;
                a[top] = x;
            }
        }

        void pop()
        {
            if(top == -1)
            {
                cout<<"Stack underflow"<<endl;
            }
            else{
                top--;
            }
        }

        int peek()
        {
            if(top == -1)
            {
                cout<<"Stack Underflow"<<endl;
                return -1;
            }
            else{
                return a[top];
            }
        }

        bool isEmpty()
        {
            if(top == -1)
                return true;
            else
                return false;
        }
};

int main()
{
    Stack s;
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);

    while(!s.isEmpty())
    {
        cout<<s.peek()<<endl;
        s.pop();
    }

    return 0;
}
