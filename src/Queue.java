/*Queue class follows the rules of First in First Out and contains the methods to enQueue,deQueue,
 * Size ,check for a given string, tells whether  empty
 */
public class Queue {
	int head=0;
	int tail=0;
	String[] str;
	public Queue(){
		 str = new String[10];
	}
	public void enQueue(String s){
		if(head<str.length) str[head++] = s;
		else  {
			String[] st = new String[2*(head-tail)];
			for(int i=tail;i<head;i++) st[i-tail] = str[i];
			head =head-tail;
			tail=0;
			str =st;
			str[head++] = s; 
		}
	}
	public String deQueue() {
	if(tail<head)	return str[tail++];
	else return "Error";
	}
	public int Size(){
		return head-tail;
	}
	public boolean isEmpty(){
		if(head==tail) return true;
		else return false;
	}
	public boolean Contains(String s) {
		
		for(int j=tail;j<head;j++) if(str[j].equals(s)) return true;
		return false;
	}
	
	
	
}

