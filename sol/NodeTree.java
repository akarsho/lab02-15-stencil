package sol;

import src.IBST;

import static java.lang.Math.max;

/**
 * A NodeTree
 */
public class NodeTree implements IBST {

    private int val;
    private IBST left;
    private IBST right;

    /**
     * Instantiates a BST
     *
     * @param value - The value to be held in the root node.
     * @param left - The left subtree
     * @param right - The right subtree
     */
    public NodeTree(int value, IBST left, IBST right) {
        this.val = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Code for printing out a string representation of the tree - feel free to use
     * in debugging and testing, but don't be too worried about how it works!
     * @param indent
     * @return
     */
    public String stringHelper(int indent) {
        String builder = "src.NodeTree[\n";
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "    val=" + this.val + "\n";
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "    left=" + this.left.stringHelper(indent + 1);
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "    right=" + this.right.stringHelper(indent + 1);
        for (int i = 0; i < indent; i++) {
            builder += "    ";
        }
        builder += "]\n";
        return builder;
    }

    public int sumBst() {
        return this.val + this.left.sumBst() + this.right.sumBst();
    }

    @Override
    public int depthBst() {
        return 1 + max(this.left.depthBst(), this.right.depthBst());
    }

    @Override
    public boolean hasElt(int search) {
        if(search == this.val) {
            return true;
        } else {
            if (search < this.val) {
                return this.left.hasElt(search);
            } else {
                return this.right.hasElt(search);
            }
        }
    }

    @Override
    public IBST addElt(int insert) {
        // assume that duplicate values will be inserted in the left subtree
        if(insert <= this.val) {
            // go left, if empty then add value
            if(this.left.depthBst() == 0) {
                this.left = new NodeTree(insert, new EmptyTree(), new EmptyTree());
            } else {
                // if not empty continue the function for the left subtree
                return this.left.addElt(insert);
            }
        } else {
            //go right, if empty then add value
            if(this.right.depthBst() == 0){
                this.right = new NodeTree(insert, new EmptyTree(), new EmptyTree());
            } else {
                // if not empty then continue the function for the right subtree
                return this.right.addElt(insert);
            }
        }
        // always return root
        return this;
    }


}
