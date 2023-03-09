import java.util.*;
class Node{
	int data;
	Node top;
	public Node(){}
	public Node(int a)
	{
		this.data=a;
	}
}

class stck extends Node{
	Node head;
	void push(int d){
		Node temp=null;
		if(head==null)
		{
			head=new Node(d);
		}
		else{

			temp=new Node(d);
			temp.top=head;
			head=temp;

		}
	}
	void pop(){
		int value=0;
		if(head==null){
			System.out.println("empty stack");
			return;
		}
		else{
			value = head.data;
			head=head.top;
		}
		System.out.println(value+" poped successfully!");
	}
	void display(){
		Node t=head;
		if(t==null)
		{
			System.out.println("Empty stack");
			return;
		}
		do{
			System.out.println("| "+t.data+" |");
			System.out.println("+----+");
			t=t.top;
		}while(t!=null);
	}
	boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
	}
	int size()
	{
		int count=0;
		Node t = head;
		if(t==null)
			return count;
		do{
			count+=1;
			t=t.top;
		}while(t!=null);
		return count;
	}
	int peek()
	{
		int value=0;
		if(head==null)
			System.out.println("Empty Stack");
		else
		{
			value=head.data;
		}
		return value;
	}

}

public class stack{
	public static void main(String[] args){
		stck s =new stck();
		Scanner c = new Scanner(System.in);
		while(true)
		{
			System.out.println("\n-------------------------------------------------------------------------------");
			System.out.println("Stack: \n== 1.push == 2.pop == 3.display == 4.isEmpty == 5.peek == 6.size == 7.exit ==");
			System.out.println("-------------------------------------------------------------------------------");
			int choice = c.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("enter the value to be pushed");
					s.push(c.nextInt());
					break;
				}
			case 2:
				{
					s.pop();
					break;
				}
			case 3:
				{
					s.display();
					break;
				}
			case 4:
				{
					System.out.println("The stack is empty : "+s.isEmpty());
					break;
				}
			case 5:
				{
					System.out.println("The peek element is : "+s.peek());
					break;
				}
			case 6:
				{
					System.out.println("\nThe size of the Stack is : "+s.size());
					break;
				}
			case 7:
				{
					return;
				}
			default:
				{
					System.out.println("Warning: Enter the correct choice !");
				}

			}
		}
	}
}