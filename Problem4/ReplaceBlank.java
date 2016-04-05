package Problem4;

/**
 * Created by liujia on 14-8-25.
 */
/*public class ReplaceBlank {

	public String replaceBlank(String input)
	{
		if(input==null)
			return null;
		StringBuffer outputBuffer=new StringBuffer();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				outputBuffer.append("%");
				outputBuffer.append("2");
				outputBuffer.append("0");
			}
			else {
				outputBuffer.append(String.valueOf(input.charAt(i)));
			}
		}
		return new String(outputBuffer);
	}
}*/

public class ReplaceBlank {  

    private static String testString = "hellow new world!";  
  
    // �����ַ����а����Ŀո����  
    public static int getBlankNum(String testString) {  
        int count = 0;  
        for (int i = 0; i < testString.length(); i++) {  
            String tempString = String.valueOf(testString.charAt(i));  
            if (tempString.equals(" ")) {  
                count++;  
            }  
        }  
        return count;  
    }  
  
    // ��ӡchar[]����  
    public static void printArray(char[] testArray) {  
        for (char i : testArray) {  
            System.out.print(i);  
        }  
        System.out.println();  
    }  
  
    // ���ַ����ո�ת��Ϊ20%  
    public static void replaceAllBlank(String testString) {  
  
        if (testString == null || testString.length() <= 0) {  
            return;  
        }  
        // �ַ������ʼ����  
        int length = testString.length();  
        // �ַ��������ӳ��Ⱥ�  
        int newLength = getBlankNum(testString) * 2  + testString.length();  
        char[] tempArray = new char[newLength];  
        System.arraycopy(testString.toCharArray(), 0, tempArray, 0, testString.toCharArray().length);  
        int indexofOriginal = length - 1;  
        int indexofNew = newLength - 1;  

        System.out.println("δ�滻�ո�ʱ���ַ�����");  
        printArray(tempArray);  

        while (indexofOriginal >= 0 && indexofOriginal != indexofNew) {  
            if (tempArray[indexofOriginal] == ' ') {  
                tempArray[indexofNew--] = '0';  
                tempArray[indexofNew--] = '2';  
                tempArray[indexofNew--] = '%';  
            } else {  
                tempArray[indexofNew--] = tempArray[indexofOriginal];  
            }  
            indexofOriginal--;  
        }  
        System.out.println("�滻�ո����ַ�����");  
        printArray(tempArray);  
  
    }  
  
    public static void main(String[] args) {  
        replaceAllBlank(testString);  
    }  
}  