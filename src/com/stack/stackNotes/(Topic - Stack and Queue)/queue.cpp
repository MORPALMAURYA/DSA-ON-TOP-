#include<iostream>
using namespace std;

class Queue
{
    int front,rear;
    int a[100];

    public :
            Queue()
            {
                front = rear = -1;
            }

            void enque(int x)
            {
                if(rear == 99)
                {
                    cout<<"Queue Overflow";
                }
                else
                {
                    if((front == -1) && (rear == -1))
                    {
                        front++;
                    }
                    rear++;
                    a[rear] = x;
                }
            }

            int deque()
            {
                if(front == -1)
                {
                    cout<<"Queue Underflow"<<endl;
                    return -1;
                }
                else
                {
                    int x = a[front];
                    if(front == rear)
                    {
                        front = rear = -1;
                    }
                    else{
                        front++;
                    }
                    return x;
                }
            }

            bool isEmpty()
            {
                if(front == -1 && rear == -1)
                    return true;
                else
                    return false;
            }
};

int main()
{
    Queue q;
    q.enque(10);
    q.enque(20);
    q.enque(30);
    q.enque(40);
    q.enque(50);
    q.enque(60);

    while(!q.isEmpty())
    {
        cout<<q.deque()<<endl;
    }


    return 0;
}
