package EY;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data types
//		
//		int a=20,b=30;
//		int sum=a+b;
//		int sub=b-a;
//		int div=b%a; //it gives reminder
//		
//		System.out.println(sum);
//		System.out.println(sub);
//		System.out.println(div);
//		
//		//Pre-increment
//		++sum;
//		System.out.println(sum);
//		
//		//post-increment
//		sum++;
//		System.out.println(sum);
//		//post-decrement
//		sum--;
//		System.out.println(sum);
//		//pre-decrement
//		--sum;
//		System.out.println(sum);
		
//		double points=9.8;
//		System.out.println(points);
//		
//		float marks= 98.5f;
//		System.out.println(marks);
//		
//		char ch='a';
//		System.out.println(ch);
//		
//		boolean flag = false;
//		System.out.println(flag);
		
		// byte =>1 1byte=>8bits short =>2bytes int=>4bytes long=>8bytes 
		//float=>4bytes double=>8bytes char=>2bytes
		
		
		//Type Casting 
		
//		int x=45;
//		double d;
//		//up-casting
//		d=x;
//		System.out.println(d);
//		//down-casting
//		x=(int)d;
//		System.out.println(x);
//		
		
		 //Relational operators
		// < > = ==, !=, <=, >=
		
		int a1=4;
		int b1=7;
		
		boolean flag1 = a1!=b1;
		System.out.println(flag1);
		
		
        //Logical operators
        // AND(&&) OR(||)  NOT(!)
		
		int c1=3;
		boolean d1=(a1>c1) && (c1<b1);
		System.out.println(d1);
		
		// conditional statement (==)
		
		int e=10;
		if(e==10) {
			System.out.println("e is 10");
		}
		else {
			System.out.println("e is not 10");
		}
		
		// ternary statement
		
		int num1=15;
		
		String res1=num1>e?"yes":"NO";
		System.out.println(res1);
		
		//Switch case
		
	}

}
