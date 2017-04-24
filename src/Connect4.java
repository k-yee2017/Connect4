
public class Connect4 {

	String[][] place;
	String piece1;
	String piece2;

	public Connect4() {
		place = new String[6][7];
		piece1 = "red";
		piece2 = "yellow";
	}

	public Connect4(int row, int col, String first, String second) {
		place = new String[row][col];
		piece1 = first;
		piece2 = second;
	}

	public void dropPiece(String typePiece, int col) {
		for (int i = place.length - 1; i > 0; i--) {
			for (int j = 0; j < place[0].length; j++) {
				if (j == col) {
					if (place[i][j] != piece1 || place[i][j] != piece2) {
						place[i][j] = typePiece;
						i = place.length;
						j = place[0].length;
					}
				}
			}
		}
	}
}
