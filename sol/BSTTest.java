package sol;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Node;
import src.IBST;
import src.IExpression;

public class BSTTest {
    private IBST t1;
    private IBST t2;
    private IBST t3;
    private IBST t4;
    private IBST t5;

    private IExpression exp1;

    // TODO: declare more test BSTs

    @Before
    public void testSetup() {
        t1 = new NodeTree(5, new NodeTree(2, new EmptyTree(),
                new EmptyTree()), new EmptyTree());
        t2 = new NodeTree(2, new NodeTree(1, new EmptyTree(), new EmptyTree()), new NodeTree(4,
                new NodeTree(3, new EmptyTree(), new EmptyTree()), new EmptyTree()));
        t3 = new NodeTree(2, new NodeTree(4, new NodeTree(3, new EmptyTree(), new EmptyTree()),
                new EmptyTree()), new NodeTree(1, new EmptyTree(), new EmptyTree()) );
        t4 = new NodeTree(2, new EmptyTree(), new EmptyTree());
        t5 = new NodeTree(5, new NodeTree(1, new NodeTree(-20, new NodeTree(-30, new NodeTree(-40,
                new EmptyTree(), new EmptyTree()),
                new NodeTree(-20, new EmptyTree(), new EmptyTree())),
                new NodeTree(10, new EmptyTree(), new EmptyTree())),
                new NodeTree(2, new EmptyTree(), new EmptyTree())),
                new NodeTree(7,
                new NodeTree(6, new NodeTree(3, new EmptyTree(), new EmptyTree()),
                        new NodeTree(10,new EmptyTree(), new EmptyTree())),
                new NodeTree(8, new EmptyTree(), new EmptyTree())));
    }

    @Before
    public void expressionSetup() {
        // 5
        exp = Number
    }

    // TODO: write more tests

    @Test
    public void testExample() {
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testSum() {
        Assert.assertEquals(7, t1.sumBst());
        Assert.assertEquals(10, t2.sumBst());
        Assert.assertEquals(10, t3.sumBst());
        Assert.assertEquals(2, t4.sumBst());
        Assert.assertEquals(-58, t5.sumBst());
    }

    @Test
    public void testDepth() {
        Assert.assertEquals(2, t1.depthBst());
        Assert.assertEquals(3, t2.depthBst());
        Assert.assertEquals(3, t3.depthBst());
        Assert.assertEquals(1, t4.depthBst());
        Assert.assertEquals(5, t5.depthBst());
    }

    @Test
    public void testHasElt() {
        Assert.assertTrue( t1.hasElt(2));
        Assert.assertTrue( t2.hasElt(3));
        Assert.assertFalse( t3.hasElt(99));
        Assert.assertFalse( t4.hasElt(40));
        Assert.assertTrue( t5.hasElt(7));
    }
}
