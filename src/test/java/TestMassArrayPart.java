import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.gb.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayPart {
    public static Stream<Arguments> dataForPart(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7,}, new int[]{1, 7}));
        list.add(Arguments.arguments(new int[]{1, 2, 4, 1, 7, 5, 3, 2,}, new int[]{1, 7, 5, 3, 2,}));
        list.add(Arguments.arguments(new int[]{1, 2, 4,}, new int[]{}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForPart")
    public void TestMassArrayPart(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, MainApp.arrayPart(in));
    }
}
