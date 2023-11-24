package racingcar.util;

import racingcar.model.TryCount;

public class TryCountConverter {

    public static TryCount convertTryCount(int tryCount) {
        return new TryCount(tryCount);
    }
}
