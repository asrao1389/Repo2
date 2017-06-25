
public class StringHelper {

	
	public String truncateInFirst2Positions(String str)
	{
		if (str.length() <= 2)
			return str.replace("A", "");
		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);
		return first2Chars.replace("A", "")+stringMinusFirst2Chars;
	}
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str)
	
	{
		
		if (str.length() <=1)
			return false;
		if(str.length() ==2)
			return true;
		
		String first2Chars = str.substring(0, 2);
		String last2Chars = str.substring(str.length() - 2);
		return first2Chars.equals(last2Chars);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
