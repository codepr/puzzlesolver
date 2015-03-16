package puzzlesolver;

/**
 * MVC Pattern controller class, implementation of IPuzzleController interface.
 */

public class PuzzleController implements IPuzzleController {

    private IPuzzleView view;

    /**
     * Constructor
     * @param v IPuzzleView type representing a puzzle view, provides input and output features.
     */

    public PuzzleController(IPuzzleView v) {
        view = v;
    }

    /**
     * Sorting method, sorts the puzzle using SortAlg type object.
     */

    public void sort() {
        SortAlg alg = new SortAlgSeq(view.puzzle());
        alg.sort();
    }

    /**
     * Output sorted puzzle to the view.
     */

    public void output() {
        view.outputPuzzle();
    }
}