import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import static org.junit.Assert.*;

// 异常测试
@Category(Categoory.NoRunWithTests.class)
public class Exception {

    // 1.使用assertThrows方法
    @Test
    public void AssertThrows() {
        List<Integer> list = new ArrayList<>();

        IndexOutOfBoundsException thrown = assertThrows(
                "没有发生异常",
                IndexOutOfBoundsException.class,
                () -> list.add(0, 1));

        assertEquals("没有发生数组越界异常","Index: 1, Size: 0", thrown.getMessage());
    }

    // 2.使用expected参数
    @Test(expected = IndexOutOfBoundsException.class)
    public void Expected(){
        List<Integer> list = new ArrayList<>();
        list.add(0, 1);
    }

    // 3.使用 try/catch 语句
    @Test
    public void tryCatch() {
        List<Object> list = new ArrayList<>();
        try {
            list.add(1, 1);
        } catch (IndexOutOfBoundsException exception) {
            assertEquals("没有发生数组越界异常","Index: 1, Size: 0", exception.getMessage());
        }
    }

}
