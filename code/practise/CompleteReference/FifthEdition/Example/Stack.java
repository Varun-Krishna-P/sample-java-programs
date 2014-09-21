package code.practise.CompleteReference.FifthEdition.Example;

public class Stack {
	int stackArray [] = new int [10];
	int tos; //top of stack
	
	Stack()
	{
		tos = -1;
	}
//	push an item onto the stack
	void push(int item){
		if (tos==9)
		System.out.println("Stack is full.");
		else
			stackArray[++tos] = item;
	}
	
//	pop an item from the stack
	int pop()
	{
		if (tos < 0){
			System.out.println("Stack underflow");
			return 0;
		}
		else
			return stackArray[tos--];
	}

}
