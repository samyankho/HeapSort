import java.util.Queue;
import java.util.Stack;

public class test {



	boolean isp(char text[]) {
		Stack s = new Stack();
		Queue q = new Queue();
		
		for(int i =0; i<text.length; i++) {
		char a = text[i];
		s.push(a);
		q.enqueue(a);
	}
		while(!s.isEmpty()) {
			if(q.getFront.equals(s.peek())) {
				return false;
			}
			q.dequeue;
			s.pop();
		}
	return true;
	}
	
	
}
