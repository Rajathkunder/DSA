import java.util.Scanner;
class stack
{
	Scanner sc=new Scanner(System.in);
	static int top=0;
	static int item;
	static int size;
	static int stack[]=new int[20];
	stack()
	{
		size=0;
		item=0;
	}
	void getdata()
	{
		System.out.println("Enter size of stack : ");
		size=sc.nextInt();
	}
	static void push(int it)
	{
		if(top==size)
			System.out.println("Stack is full (Overflow)");
		else
		{
			top=top+1;
			stack[top]=it;
			System.out.println("1 item pushed");
		}
	}
	static void display()
	{
		for(int i=top;i>0;i--)
		System.out.println(stack[i]+" ");
	}
	static void pop()
	{
		int it;
		if(top==0)
			System.out.println("Stack is empty (Underflow)");
                else
                {
     			it=stack[top];
     			top=top-1;
     			System.out .println(it +" is popped");
		}
	}
}
class push
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stack s=new stack();
		s.getdata();
		int opt,item;
		do
		{
			System.out.println("1.Push\n2.Pop\n3.Display\nEnter your choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter element to be pushed");
				item=sc.nextInt();
				s.push(item);
				break;
				case 2:s.pop();
				break;
				case 3:s.display();
				break;
			}
			System.out.println("Do you want to continue? (Pess 1 to continue)");
			opt=sc.nextInt();
		}
		while(opt==1);
	}
}