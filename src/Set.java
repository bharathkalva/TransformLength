
/* Set class stores the string objects and checks for a word if exist in the stored objects.*/
public class Set {
	Node nd;
	public Set(){
		 nd = new Node('1');
    }
	public void Add(String str){
		Node Nd =nd;
        for(int i=0;i<str.length();i++){
      	  if(Nd.Contains(str.charAt(i))) Nd = Nd.getNode(str.charAt(i));
      	  else {         	  
      	  Node temp = new Node(str.charAt(i));
      	  Nd.Add(temp);
      	  Nd = temp;
      	  }
        }
        Nd.Add(new Node('['));
	}
	public  boolean Contains(String str){
		 Node temp =nd;
		   for(int i=0;i<str.length();i++) {
			  char ch = str.charAt(i);
			  if(!temp.Contains(ch)) return false;
			  temp = temp.getNode(ch);
		  }
		   if(!temp.Contains('['))return false;
		   return true;
		}
}
