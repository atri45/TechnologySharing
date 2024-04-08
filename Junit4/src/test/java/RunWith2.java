import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

//  Parameterized类 Runner使用方法1
@RunWith(Parameterized.class)
@Category(Categoory.RunWithTests.class)
public class RunWith2 {
    // 定义参数
    public int add1;
    public int add2;
    public int result;

    // 实现包含传入参数的构造器
    public RunWith2(int add1, int add2, int result) {
        this.add1 = add1;
        this.add2 = add2;
        this.result = result;
    }

    // 实现返回参数的方法,并且返回类型必须是Iterable类型或数组类型
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
