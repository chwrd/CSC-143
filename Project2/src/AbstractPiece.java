import java.awt.Color;

public class AbstractPiece{
	
	class LShape extends Shape(int r, int c, Grid g){
		super(r, c, g);
		square[0] = new Square(g, r - 1, c, Color.magenta, true);
		square[1] = new Square(g, r, c, Color.magenta, true);
		square[2] = new Square(g, r + 1, c, Color.magenta, true);
		square[3] = new Square(g, r + 1, c + 1, Color.magenta, true);
}
	
}