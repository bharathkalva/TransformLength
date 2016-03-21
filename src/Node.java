/* Node class stores one character and has an array node which stores the successive characters of
 * all the  words in dictionary 
 */

public class Node {
   	char ch;
   	Node[] Arr = new Node[27];
	public Node(char ch){
		this.ch = ch;
	}
   	public boolean Contains(char chr){
   		if(Arr[chr-'A']==null) return false;
   		return true;
   	}
   	public char getChar() {
   		return ch;
   	}
	public void Add(Node Nd){
		Arr[Nd.getChar()-'A'] = Nd;
	}
	public Node getNode(char chr){
		return Arr[chr-'A'];
	}
	
}
