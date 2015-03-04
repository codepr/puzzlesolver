package puzzlesolver;

import java.util.Vector;
import java.util.Iterator;

public abstract class SortAlg {

    private Puzzle model;

    public SortAlg(Puzzle m) {
        model = m;
    }

    public Puzzle puzzle() {
        return model;
    }

    public abstract Piece firstPiece();

    public abstract Piece nextInRow(Piece p);

    public abstract Piece nextInCol(Piece p);

    public abstract Vector<Piece> sortRow(Piece p);
}