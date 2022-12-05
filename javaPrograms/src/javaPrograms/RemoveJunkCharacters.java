package javaPrograms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		String s = "!)*#^)wjdnsvjnBJ :?>}|KB";
		
		String clear = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(clear);
	}

}
