package GUITest;

import javax.swing.*; // GUI ȭ���� ���� swing ��Ű�� ��������
import java.awt.*; // �۾��� ��Ʈ�� ���� awt ��������

class table {
	public static void main(String args[]) {
		Dimension dim = new Dimension(400, 150);
		
		JFrame frame = new JFrame("AnalyzSystem");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		String header[] = {"��Ȳ�ڷ�", "�Է°�", "��������"}; // ���̺� ���
		String contents[][] = { // ���̺� ����
				{"������", "120000", ""},
				{"�����ο�", "80","10%"},
				{"���밡���ο�", "150", ""},
				{"����⼮��", "20", ""}
		};
		
		JTable table = new JTable(contents, header); // JTable ��ü ����
		JScrollPane scrollpane = new JScrollPane(table); // JSCrollPane:UI���� ĭ�� �����ϸ� ���Ʒ��� ��ũ�� ������
		frame.add(scrollpane);
		
		
		frame.pack();
		frame.setVisible(true);
	}
}

