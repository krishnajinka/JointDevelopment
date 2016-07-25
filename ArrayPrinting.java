import java.util.Stack;


public class ArrayPrinting {

	public static void main(String[] args) {
		int[] a1 = new int[]{1,2,3,4,5};
		int[] a2 = new int[]{6,7,8};
		
		int len1=a1.length;
		int len2=a2.length;
		
		Stack<Integer> st = new Stack<Integer>();
		
		int i=0, j=0, count=0;
		while(i < len1 || j < len2) {
			if (count%2==0) {//if even push arr1
				if (i<len1) {
					st.push(a1[i++]);
				}
			}else {//if odd push arr2
				if (j < len2) {
					st.push(a2[j++]);
				}
			}
			count++;
		}
		
		System.out.println("stack: " + st);
		/*
		 * The elements are in reverse order if printed directly from stack.
		 * hence move them to new stack and print from there
		 */
		Stack<Integer> st2 = new Stack<Integer>();
		while (!st.isEmpty()) {
			st2.push(st.pop());
		}
		
		System.out.println("stack2: " + st2);
		System.out.println("Print from stack2: ");
		while (!st2.isEmpty()) {
			System.out.print(" " + st2.pop());
		}
		
	}

}
