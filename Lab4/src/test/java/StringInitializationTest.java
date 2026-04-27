import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class StringInitializationTest {

    String testString;

    @BeforeEach
    public void before() {
        testString = "mz";
    }

    @Test
    public void createSimpleInstance() {
        String name = "String";
        System.out.println(name);
    }

    @Test
    public void createStringUsingConstructor() {
        String name = new String("String");
        System.out.println(name);
    }


    @Test
    public void create2StringWithSameValue() {
        String a = "hey";
        String b = "hey";

        //TODO write a suitable test to check equality of these strings

        System.out.println(a.equals(b));
    }

    @Test
    public void create2StringArrays() {
        String[] a = {"java", "c++", "javascript"};
        String[] b = {"java", "c++", "javascript"};

        //TODO write a suitable test to check equality of these string arrays
        boolean test = true;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                System.out.println(false);
                test = false;
                break;
            }
        }
        if (test == true) {
            System.out.println(true);
        }
    }

    @Test
    public void equalityOfStrings() {
        String[] data1 = {"mz", "my", "my", "mx", "mz", "mx", "my", "mz"};
        String[] data2 = {"mz", "mz", "mz", "mx", "mx", "my", "my", "my"};

        System.out.println(data1[0] == "mz");
        System.out.println(data1[0] == data2[2]);
        System.out.println(data1[0] == new String(data2[0]));

        //TODO convert below prints to asserts
        assert (data1[0].equals(testString));
        assert (data1[0].equals(new String(testString)));

    }
}
