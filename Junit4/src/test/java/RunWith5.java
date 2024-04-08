import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Categories.class)
// 执行包含NoRunWithTests标签但不包含的AssertTests标签的测试用例
@IncludeCategory(Categoory.NoRunWithTests.class)
@ExcludeCategory(Categoory.AssertTests.class)
@SuiteClasses({
        Annotation.class,
        Assert.class,
        Exception.class,
        Timeout.class,
        RunWith1.class,
        RunWith2.class,
        RunWith3.class
})
public class RunWith5 {}
