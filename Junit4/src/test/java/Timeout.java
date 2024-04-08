import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.concurrent.TimeUnit;

@Category(Categoory.NoRunWithTests.class)
public class Timeout {

    @Test(timeout = 1000)
    public void test1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

}
