package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.function.Supplier;

public class RandomNumberSupplier {

    public static Supplier<Integer> supplyRandomNumber() {
        return () -> Randoms.pickNumberInRange(0, 9);
    }
}
