package Problem49;

public class Problem49test {
	public static void main(String args[]) {
		String s="-645300";
		char[] c =s.toCharArray();
		StrToIntCore strToIntCore=new StrToIntCore();
		try {
			System.out.print(strToIntCore.StrToInt(c));
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}
	
	

}
