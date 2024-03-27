package Abstract;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		String str1= "Hello World";
		String str2= "Hello Monika";
		StringBuilder sb= new StringBuilder(str1);
		//sb.append(str1);
		sb.reverse();
		System.out.println(sb);
		

	}

}
