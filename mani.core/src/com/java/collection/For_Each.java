package com.java.collection
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class For_Each {
	public static void main(String[] arg) {
		{
			List<Integer> marks = Arrays.asList(300, 100, 500, 200 );
			/*Integer[] spam = new Integer[] { 1, 2, 3 };
			List<Integer> list = Arrays.asList(spam);
*/
			int highest_marks = maximum(marks);
			System.out.println("The highest score is " + marks.get(highest_marks));
		}
	}

	public static int maximum(List<Integer>  numbers) {
		int maxSoFar = 520;

		// for each loop
		int useCaseIndex = 0, i = 0;
		for (int num : numbers) {
			if (maxSoFar <= Collections.max(numbers) && maxSoFar >= num) // if (maxSoFar >=num && maxSoFar <=num)
			{
				useCaseIndex = i;
				System.out.println("the max no in lis " + Collections.max(numbers) );
				
				System.out.println("the condition " + maxSoFar + " >= " + num);
			}
			i++;
		}
		return useCaseIndex;
	}
}
