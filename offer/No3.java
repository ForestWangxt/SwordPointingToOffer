package offer;

public class No3 {
	/**
	 * ��һ����ά�����У�ÿһ�ж����մ����ҵ����� ˳������
	 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������
	 * ������һ����ά�����һ���������ж��������Ƿ��и�����
	 * 
	 * ���ɣ�����ѡȡ���������Ͻǵ����֡���������ֵ���Ҫ���ҵ����֣����ҹ��̽�����
     * ��������ִ���Ҫ���ҵ����֣��޳�����������ڵ��У����������С��Ҫ���ҵ����֣��޳�����������ڵ��С�
     * Ҳ����˵���Ҫ���ҵ����ֲ�����������Ͻǣ���ÿ���ζ�������Ĳ��ҷ�Χ���޳����л���һ�У�����ÿһ����������С
     * ���ҵķ�Χ��ֱ���ҵ�Ҫ���ҵ����֣����߲��ҷ�ΧΪ�ա�
     *
     * @param matrix �����ҵ�����
     * @param number Ҫ���ҵ���
     * @return ���ҽ����true�ҵ���falseû���ҵ�
	 */
	private static boolean find(int[][] matrix, int number){
		//�����ж�����
		if(matrix == null || matrix.length <1 || matrix[0].length <1){
			return false;
		}
		
		int rows = matrix.length;    //���������
		int cols = matrix[0].length; //���������
		
		int row = 0;		//��ʼ���к�
		int col = cols - 1; //��ʼ���к�
		
		//Ҫ���ҵ�λ��ȷ��������֮��
		while(row >= 0 && row < rows && col >= 0 && col < cols){
			if(matrix[row][col] == number){ //����ҵ��˾�ֱ��return
				return true;
			} else if(matrix[row][col] > number) {//����ҵ�������Ŀ������˵��Ҫ�ҵ����ڵ�ǰ�������
				col--; //������һ�����������ƶ�
			} else {//����ҵ�������Ŀ����С��˵��Ҫ�ҵ����ڵ�ǰ�����±�
				row++;//������һ�����������ƶ�
			}
			
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] matrix = {
				{1,2,8,9},
				{2,4,9,12},
				{4,7,10,13},
				{6,8,11,15}
		};
		System.out.println(find(matrix, 7));	//Ҫ���ҵ�����������
		System.out.println(find(matrix, 5));	//Ҫ���ҵ�������������
		System.out.println(find(matrix, 1));	//Ҫ���ҵ�������������С������
		System.out.println(find(matrix, 15));	//Ҫ���ҵ�������������������
		System.out.println(find(matrix, 0));	//Ҫ���ҵ�������������С�����ֻ�ҪС
		System.out.println(find(matrix, 16));	//Ҫ���ҵ������������������ֻ�Ҫ��
		System.out.println(find(null, 16));	//��׳�Բ��ԣ������ָ��

	}

}
