import org.junit.*;
import org.junit.experimental.categories.Category;

// 一些基础的注解
@Category(Categoory.NoRunWithTests.class)
public class Annotation {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("@BeforeClass --> 静态方法，在所有测试用例之前执行，并且全局只会执行一次");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("@AfterClass --> 静态方法，在所有测试用例之后执行，并且全局只会执行一次");
    }

    @Before
    public void before() {
        System.out.println("@Before --> 在每个测试用例之前运行");
    }

    @After
    public void after() {
        System.out.println("@After --> 在每个测试用例之后运行");
    }

    @Test
    public void testCase1() {
        System.out.println("@Test --> 测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("@Test --> 测试用例2");
    }

    @Test
    @Ignore
    public void testCase3() {
        System.out.println("@Ignore --> 忽略此测试用例");
    }

}


