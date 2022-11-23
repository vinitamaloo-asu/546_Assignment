import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class DrawCanvas  extends JFrame{
	
	public void drawCanvas() {
		CodePanel textPanel = new CodePanel();
		textPanel.setBounds(0, 0, 250, 700);
		textPanel.setBackground(Color.yellow);
		
		CanvasPanel drawPanel = new CanvasPanel();
		drawPanel.setBounds(250, 0, 450, 700);
		drawPanel.setBackground(Color.cyan);
		
		JMenuBar bar = new JMenuBar();
		JMenu jMenuBar = new JMenu("File");
		
		bar.setBounds(0, 0, 500, 20);
		
		JMenuItem item1 = new JMenuItem("New");
		JMenuItem item2 = new JMenuItem("Save");
		JMenuItem item3 = new JMenuItem("Load");
		
		jMenuBar.add(item1);
		jMenuBar.add(item2);
		jMenuBar.add(item3);
		bar.add(jMenuBar);
		
		MouseListener ml = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				
				System.out.println("Tesing");
				if(x >= 450) {
					String name = JOptionPane.showInputDialog("Name");
					System.out.println(name);
					DataSource.getInstance().getPoints().add(new Point(x, y, name));
					drawPanel.repaint();
					textPanel.repaint();
				}
				
			}
		};

		add(textPanel);
		add(drawPanel);
//		drawPanel.paint(drawPanel.getGraphics());
//		textPanel.paint(textPanel.getGraphics());
		setJMenuBar(bar);
		addMouseListener(ml);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
		
	}
	
	
}
