package src;

import sol.NodeTree;

public interface IBST {
    public String stringHelper(int n);
    public int sumBst();
    public int depthBst();
    public boolean hasElt(int search);
    public IBST addElt(int insert);
}
