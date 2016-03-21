import java.io.File;
import java.util.Scanner;
/*class Dictionary takes words from  text file "EnglishWords" containing 100000 words and has methods
 * which takes a word and tells whether the word exists in Dictionary using efficient data structure
 * which tells whether the word exist in few iterations of over 100000 words .
 */
public class Dictionary {
	Node nd = new Node('1');
	int i=0;  
public Dictionary() {
      try {
          Scanner input = new Scanner(System.in);
          File file = new File("EnglishWords");
          input = new Scanner(file);
          while (input.hasNextLine()) {
              String str = input.nextLine();
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
          input.close();
      } catch (Exception ex) {
          ex.printStackTrace();
      }
}
  
   public boolean Contains(String str) {
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




