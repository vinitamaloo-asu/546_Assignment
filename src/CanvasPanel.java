import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

public class CanvasPanel extends JPanel {
	
	CanvasPanel() {}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		List<Point> points = DataSource.getInstance().getPoints();
		for(int i = 0; i < points.size(); i++) {
			g.drawRect(points.get(i).x, points.get(i).y, 10, 10);
			g.drawString(points.get(i).name, points.get(i).x, points.get(i).y);
		}
		
	}
}
