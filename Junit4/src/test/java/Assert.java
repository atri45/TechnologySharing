import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

// 断言
@Category({Categoory.AssertTests.class,Categoory.NoRunWithTests.class})
public class Assert {

    @Test
    public void AssertEquals() {
        assertEquals("AssertEquals() --> 两者不同\n", "你好", "你好！");
    }

    @Test
    public void AssertArrayEquals() {
        int[] expected = {1};
        int[] actual = {2};
        assertArrayEquals("AssertArrayEquals() --> 两个数组不同\n", expected, actual);
    }

    @Test
    public void AssertTrue() {
        assertTrue("AssertTrue() --> 条件不为ture\n", false);
    }

    @Test
    public void AssertFalse() {
        assertFalse("AssertFalse() --> 条件不为false\n", true);
    }

    @Test
    public void AssertNull() {
        assertNull("AssertNull() --> 结果不为null\n", 1);
    }

    @Test
    public void AssertNotNull() {
        assertNotNull("AssertNotNull() --> 结果为null\n", null);
    }

    @Test
    public void AssertSame() {
        assertSame("AssertSame() --> 两个对象不相同\n", Annotation.class, Assert.class);
    }

    @Test
    public void AssertNotSame() {
        assertNotSame("AssertNotSame() --> 两个对象相同\n", Assert.class, Assert.class);
    }

}
