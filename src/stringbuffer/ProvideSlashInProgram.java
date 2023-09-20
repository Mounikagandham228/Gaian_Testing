package stringbuffer;

public class ProvideSlashInProgram {

	public static void main(String[] args) {
	 StringBuffer sb=new StringBuffer("18052023");
      sb.insert(2, '/');
      sb.insert(5, '/');
      System.out.println("output:" +sb);
	}

}
//output:18/05/2023 