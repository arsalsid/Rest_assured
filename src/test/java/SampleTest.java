import org.testng.annotations.Test;

public class SampleTest {

    @Test (priority = 2)
    public static void method1()
    {
        System.out.println("Pakistan");
    }

    @Test (priority = 1)
    public static void method2()
    {

        for (int i = 1; i <= 4; i++) {

            System.out.println("Germany");

        }

    }

    public static void main(String[] args) {
        SampleTest test = new SampleTest();
        test.method1();
        test.method2();
    }
}
