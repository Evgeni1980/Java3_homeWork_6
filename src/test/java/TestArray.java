import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.MainApp;

public class TestArray {
    @Test
    public void test1arrayPart(){

        int[] in = {1, 3, 4, 5, 5, 6, 8};
        int[] out = {5, 5, 6, 8,};
        Assertions.assertArrayEquals(out, MainApp.arrayPart(in));

    }

    @Test
    public void test2arrayPart(){
        int[] in = new int[]{1, 3, 2, 5, 8, 8,};
        Assertions.assertThrows(RuntimeException.class, ()->{
            MainApp.arrayPart(in);
        });
    }

    @Test
    public void test1ArraysContainsOnly(){
        int[] in = new int[]{1, 8, 4, 7};
        Assertions.assertFalse(MainApp.arraysContainsOnly(in));
    }

    @Test
    public void test2ArraysContainsOnly(){
        int[] in = new int[]{1, 4, 1, 4};
        Assertions.assertTrue(MainApp.arraysContainsOnly(in));
    }
}
