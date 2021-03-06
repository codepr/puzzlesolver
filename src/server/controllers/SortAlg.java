package puzzlesolver;

/**
 * Sorting algorithm abstract base
 */

public abstract class SortAlg {

    private int size;
    private Puzzle model;
	private SharedSortStat shared;

    /**
     * Constructor
     * @param m puzzle model to sort
     * @param s size of the part of the puzzle that must be sorted
	 * @param shared reference to the shared object needed to allow
	 * communication between threads
     */

    public SortAlg(Puzzle m, int s, SharedSortStat shared) {
        model = m;
        size = s;
		this.shared = shared;
    }

	/**
	 * @return return puzzle model
	 */

    public Puzzle puzzle() {
        return model;
    }

	/**
	 * @return return size of the puzzle model
	 */

    public int size() {
        return size;
    }

	/**
	 * @return reference to the shared object
	 */

	public SharedSortStat getShared() {
		return shared;
	}

	/**
	 * Subtract a unit from the puzzle model size
	 */

    protected void subOne() {
        size--;
    }

    /**
     * Abstract sort method, must be overridden.
     */

    public abstract void sort();
}
