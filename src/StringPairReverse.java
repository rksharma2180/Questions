public class StringPairReverse {

	public static void main(String[] args) {
		String inputString = "abcdefgh";
		char[] charArray = inputString.toCharArray();
		char temp = 'a';
		for (int i = 0, j = (charArray.length -1) ; i < charArray.length / 2; i = i + 2, j = j-2) {
			temp = charArray[i + 1];
			charArray[i + 1] = charArray[j];
			charArray[j] = temp;
			temp = charArray[i];
			charArray[i] = charArray[j - 1];
			charArray[j - 1] = temp;
		}
		System.out.println(new String(charArray));
	}
}
