#include<iostream>
using namespace std;

class Deque
{
    int front , rear;
    int a[100];

    public :
        Deque()
        {
            front = rear = -1;
        }

        void push_front(int x)
        {
            if(front == 0)
            {
                cout<<"Insertion not possible"<<endl;
            }
            else
            {
                if(front == -1)
                {
                    front++;
                    rear++;
                    a[front] = x;
                }
                else{
                    front--;
                    a[front] = x;
                }

            }
        }

        void push_back(int x)
        {
            if(rear == 99)
            {
                cout<<"Insertion not possible"<<endl;
            }
            else{

                if(front == -1 && rear == -1)
                {
                    front++;
                    rear++;
                    a[rear] = x;
                }
                else
                {
                    rear++;
                    a[rear] = x;
                }
            }
        }

        void pop_front()
        {
            if(front == -1)
            {
                cout<<"Deletion not possible"<<endl;
            }
            else
            {
                if(front == rear)
                    front = rear = -1;
                else
                    front++;
            }
        }

        void pop_back()
        {
            if(rear == -1)
                cout<<"Deletion not possible"<<endl;
            else{
                if(front == rear)
                    front = rear = -1;
                else
                    rear--;
            }
        }

};
