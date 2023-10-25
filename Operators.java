class Demo
{
	void arithmeticOperators()
	{
		int a1=100,b1=200;
		System.out.println("Addition is::"+(a1+b1));
		System.out.println("Sub::"+(a1-b1));
		System.out.println("Division is::"+(a1/b1));
		System.out.println("Module is::"+(a1%b1));
		System.out.println("Multiple is::"+(a1*b1));
	}
	void relationalOperators()
	{
		int a1=100,b1=200;
		System.out.println("less than::"+(a1<b1));
		System.out.println("Greater than::"+(a1>b1));
		System.out.println("Equal to::"+(a1==b1));
		System.out.println("NotEqual to::"+(a1!=b1));
	}
	void logicOperatorss()
	{
		int a1=100,b1=200;
		System.out.println("LogicalAND::"+((a1<b1)&&(b1>a1)));
		System.out.println("LogicalAND::"+((a1>b1)&&(b1>a1)));
		System.out.println("LogicalOR::"+((a1>b1)&&(b1>a1)));
		System.out.println("LogicalNOT::"+(!(a1>b1)));
	}
	
	void bitwiseOperators()
	{
		int a1=2,b1=3;
		System.out.println("BitWiseAND::"+((a1&b1)));
		System.out.println("BitWiseOR::"+((a1|b1)));
		System.out.println("LeftShift::"+((a1<<1)));
		System.out.println("RightShift::"+((a1>>1)));
		System.out.println("XOR::"+(a1^b1));
	}
}
public class Operators {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		//f1.arithmeticOperators();
		//f1.relationalOperators();
		//f1.logicOperatorss();
		f1.bitwiseOperators();

	}

}
