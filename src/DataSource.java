import java.util.ArrayList;
import java.util.List;

public class DataSource {

	protected static DataSource instance;
	private static List<Point> points;

	private DataSource() {
		points = new ArrayList<>();
	}
	
	public static DataSource getInstance() {
		if(instance == null) {
			instance = new DataSource();
		}
		
		return instance;
	}
	
	public List<Point> getPoints() {
		return points;
	}
	
}
