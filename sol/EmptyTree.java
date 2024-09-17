package sol;

import src.IBST;

/**
 * An Empty Tree
 */
public class EmptyTree implements IBST {
    public EmptyTree() { }

    /**
     * Helper method for printing out a String representation of an empty tree -
     * feel free to use in debugging/testing!
     * @param i
     * @return
     */
    @Override
    public String stringHelper(int i) {
        return "src.EmptyTree";
    }

    @Override
    public int sumBst() {
        return 0;
    }

    @Override
    public int depthBst() {
        return 0;
    }

    @Override
    public boolean hasElt(int search) {
        return false;
    }

    @Override
    public IBST addElt(int insert) {
        return new NodeTree(insert, new EmptyTree(), new EmptyTree());
    }
}
