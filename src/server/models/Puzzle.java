package puzzlesolver;

import java.util.Vector;
import java.util.Iterator;
import java.io.Serializable;

public class Puzzle implements Serializable {

    private Vector<IPiece> pieces;

	/**
	 * Constructor
	 */

    public Puzzle() {
        pieces = new Vector<IPiece>();
    }

    /**
     * @return size an int value representing size of the puzzle.
     */

    public int size() {
        return pieces.size();
    }

    /**
     * Add a piece to the Vector of pieces.
     * @param p reference to a Piece.
     */

    public void addPiece(IPiece p) {
        pieces.add(p);
    }

    /**
     * @return A Vector of pieces representing the puzzle.
     */

    public Vector<IPiece> pieces() {
        return pieces;
    }

    /**
     * Set a new puzzle.
     * @param pcs a Vector of pieces that will replace the current Vector.
     */

    public void setPieces(Vector<IPiece> pcs) {
        pieces = pcs;
    }
}
