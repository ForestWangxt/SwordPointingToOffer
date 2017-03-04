package offer;

public class No4 {
	
	/**
	 * ��ʵ��һ�����������ַ����е�ÿ���ո��滻��"%20"�����硰We are happy.�����������We%20are%20happy.����
     *
     * @param string     Ҫת�����ַ�����
     * @return ת������ַ���
	 */
	public static String replaceBlank(char[] string){
		//�ж������Ƿ�Ϸ�
		if(string == null){
			return null;
		}
		
		//ͳ���ַ������еĿհ��ַ���
		int whiteCount = 0;
		for(int i = 0; i < string.length; i++){
			if(string[i] == ' '){
				whiteCount++;
			}
		}
		//�жϿո��Ƿ�Ϊ0��
		if(whiteCount == 0){
			return null;
		}
		//����ת������ַ������Ƕ���
		int targetLength = whiteCount * 2 + string.length;
		char[] temp = new char[targetLength];
		int j = targetLength - 1;//����������ĩβ��ʼ
		int i = string.length - 1;//���ַ�����ĩβ��ʼ
		
		while(i >= 0){
			if(string[i] == ' '){
				temp[j--] = '0';
				temp[j--] = '2';
				temp[j--] = '%';
			} else {
				temp[j--] = string[i];
				
			}
			i--;
		}
		
		return new String(temp);
	}

	public static void main(String[] args) {
		String str = "We are happy.";
		char[] array = str.toCharArray();
		System.out.println(replaceBlank(array));
		String str1 = "Wearehappy.";
		char[] array1 = str1.toCharArray();
		System.out.println(replaceBlank(array1));
		String str2 = " Wearehappy.";
		char[] array2 = str2.toCharArray();
		System.out.println(replaceBlank(array2));
		String str3 = " ";
		char[] array3 = str3.toCharArray();
		System.out.println(replaceBlank(array3));
		
	}
}
