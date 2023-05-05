package StreamDemo;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(45,18,7,11,99,10);
		
		System.out.println(list);
		System.out.println(list.size());
		
		Stream<Integer> stream = list.stream();
		
		Stream<Integer> odd = stream.filter(a -> a%2==0);
		
		Stream<Integer> add=odd.map(a -> a+4);
		
		int sum = add.reduce(0, (p,q) -> p+q); 
		
//		System.out.println(sum);
		
		
		
		Predicate<Integer> pre =   t ->  t%2!=0;
		
        Function<Integer, Integer> fn = t ->  t-5;
        
        BinaryOperator<Integer> bin = (t, u) ->  t+u;
		
        
        int result = list.stream()
        .filter(k -> k%2!=0)
        .map(k -> k-5)
        .reduce(0, (k1,k2) -> k1+k2);

       System.out.println(result);
		
//		int sum=0;
//		
//		for(int n:list) {
//			if(n%2!=0) {
//				n=n-3;     // 42,4,8,96
//				sum=sum+n; //
//			}
//		}
//		System.out.println(sum);
		
//		Consumer<Integer> con = (t) -> System.out.println(t);
//		
//		list.forEach(con);
	}

}
