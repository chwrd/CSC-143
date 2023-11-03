import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

public class TetrisTest {

	@Test
	void testCheckRows() {
		Grid g = new Grid();
			for (int row = 0; row < Grid.HEIGHT; row++) {
				for (int col = 0; col < Grid.WIDTH; col++) {
					if (row != 5 && row != 15 || col == 4 || col == 5)
					g.set(row, col, Color.BLUE);
				}
			}
			
		g.checkRows();
		for (int row = 0; row < Grid.HEIGHT; row++) {
			for (int col = 0; col < Grid.WIDTH; col++) {
				if (row != 5 && row != 15 || col == 4 || col == 5)
				g.set(row, col, Color.BLUE);
			}
		}

	}

}
