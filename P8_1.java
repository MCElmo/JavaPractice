import java.util.*;
import java.util.function.Consumer;
import java.util.function.ToIntBiFunction;

public class P8_1 {
	public static void main(String[] args) {
		Map<String,ToIntBiFunction<Integer,Integer>> map = new HashMap<>();
		map.put("0", (x,y) -> x +y);
		
		Consumer<Integer> t = (x) -> System.out.print(x);
		System.out.println(map.get("0").applyAsInt(0, 2));
		t.andThen((x) -> System.out.print(x));
		t.accept(600);
		Deque<Integer> test = new ArrayDeque<>();System.out.println();
		test.addLast(6);
		test.add(45);
		test.pop();
		test.add(18);
		for(int i:	test)
			System.out.println(i);
	}
}
