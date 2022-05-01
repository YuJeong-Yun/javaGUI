package GUITest;

import javax.swing.*; // GUI 화면을 위해 swing 패키지 가져오기
import java.awt.*; // 글씨의 폰트를 위해 awt 가져오기

class table {
	public static void main(String args[]) {
		Dimension dim = new Dimension(400, 150);
		
		JFrame frame = new JFrame("AnalyzSystem");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		String header[] = {"현황자료", "입력값", "오차범위"}; // 테이블 헤더
		String contents[][] = { // 테이블 내용
				{"수강료", "120000", ""},
				{"수강인원", "80","10%"},
				{"수용가능인원", "150", ""},
				{"평균출석일", "20", ""}
		};
		
		JTable table = new JTable(contents, header); // JTable 객체 생성
		JScrollPane scrollpane = new JScrollPane(table); // JSCrollPane:UI들이 칸이 부족하면 위아래로 스크롤 제공함
		frame.add(scrollpane);
		
		
		frame.pack();
		frame.setVisible(true);
	}
}

