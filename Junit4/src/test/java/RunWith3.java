import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

//  Parameterized类 Runner使用方法2
@RunWith(Parameterized.class)
@Category(Categoory.RunWithTests.class)
public class RunWith3 {
    // 定义并标注参数，参数序号从0开始
    @Parameter(0)
    public int add1;
    @Parameter(1)
    public int add2;
    @Parameter(2)
    public int result;

    // 实现返回参数的方法
    @Parameters
    public static List<Integer[]> params() {
        return Arrays.asList(new Integer[][]{{1,1,2},{2,3,5},{3,4,8}});
    }

    // 测试用例
    @Test
    public void addTest() {
        System.out.println(add1 + " + " + add2 + " = " + (add1 + add2));
        assertEquals("AssertEquals() --> 加法结果出错\n", result, add1 + add2);
    }
}
