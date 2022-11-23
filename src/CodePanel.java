import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class CodePanel extends JPanel {
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		List<Point> points = DataSource.getInstance().getPoints();
		
		for(int i = 0; i < points.size(); i++) {
			String str = "class " + points.get(i).name + "{}";
			g.drawString(str, 40, (i + 1) * 40);
		}
	}
	
}
