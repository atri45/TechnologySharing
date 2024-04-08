import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
// 执行包含RunWithTests标签的测试用例
@IncludeCategory(Categoory.RunWithTests.class)
@SuiteClasses({
        Annotation.class,
        Assert.class,
        Exception.class,
        Timeout.class,
        RunWith1.class,
        RunWith2.class,
        RunWith3.class
})
public class RunWith4 {}
