package stringbuffer;

public class DeleteCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     StringBuffer sb=new StringBuffer("qspiders xyz punjagutta");
     sb.delete(9, 130);
     //sb.deleteCharAt(8);
     //sb.deleteCharAt(9);
     //sb.deleteCharAt(10);
     //sb.deleteCharAt(11);
    // sb.deleteCharAt(12);
     
     System.out.println("after changes:" +sb);
	}

}
