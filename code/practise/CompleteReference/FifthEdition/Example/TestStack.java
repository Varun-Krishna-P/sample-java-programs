package code.practise.CompleteReference.FifthEdition.Example;

public class TestStack {
	public static void main (String args[]){
		Stack stack = new Stack();
		Stack stack1 = new Stack();
//		push some numbers on to the stack
		for (int i=0; i<10; i++)
			stack.push(i);
		for (int i=10;i<20;i++)
			stack1.push(i);
//		pop those numbers off the stack
		for (int i=0;i<10;i++)
			System.out.println(stack.pop());
		for (int i=10;i<20;i++)
			System.out.println(stack1.pop());
	}

}
