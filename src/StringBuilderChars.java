
public class StringBuilderChars {

	public static void main(String[] args) {
		StringBuilder buffer = new StringBuilder("Hello");
		
		System.out.printf("buffer = %s%n", buffer.toString());
		System.out.printf("char at 0 = %s%nchar at 3 = %s%n ", buffer.charAt(0), buffer.charAt(3));
		
		char[] charArray = new char[buffer.length()];
		buffer.getChars(0, buffer.length(), charArray, 0);
		System.out.print("The characters are: ");
		
		for(char character: charArray) { //enhanced for statement
			System.out.print(character);
		}
		
		buffer.setCharAt(0, 'J');
		buffer.setCharAt(1, 'A');
		buffer.setCharAt(2, 'V');
		buffer.setCharAt(3, 'A');
		buffer.setCharAt(4, ' ');
		System.out.printf("%n%n buffer = %s", buffer.toString());
		
		buffer.reverse();
		System.out.printf("%n%n reverse the buffer = %s", buffer.toString());
		
		System.getProperty("line.separator"); //returns a platform independent newline
		
		buffer.append(System.getProperty("line.separator"));
		buffer.append(charArray);
		buffer.append(charArray,0,3);
		buffer.append(System.getProperty("line.separator"));
		
		System.out.printf("%n%nbufferAppend = %s%n", buffer.toString());
		
		buffer.insert(0, 'A');
		buffer.insert(0, charArray, 2, 1);
		buffer.append(System.getProperty("line.separator"));
		
		System.out.printf("%n%nbufferInsert = %s%n", buffer.toString());
		
		buffer.delete(0, 3);
		buffer.append(System.getProperty("line.separator"));
		System.out.printf("%n%nbufferDelete = %s%n", buffer.toString());
		
			  
		

	}

}
