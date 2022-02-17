import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.gb.MainApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArraysContainsOnly {
    public static Stream<Arguments> dataForContainsOnly(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4,}, true));
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1,}, false));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4,}, false));
        list.add(Arguments.arguments(new int[]{1, 4, 4, 1, 1, 4, 3}, false));
        list.add(Arguments.arguments(new int[]{14, 41, 11, 44}, false));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForContainsOnly")
    public void massTestArraysContainsOnly(int[] in, boolean flag){
        Assertions.assertEquals(flag, MainApp.arraysContainsOnly(in));
    }
}
