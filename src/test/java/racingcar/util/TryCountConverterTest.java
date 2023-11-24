package racingcar.util;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.TryCount;

class TryCountConverterTest {

    @DisplayName("입력값 5를 TryCount 로 변환하면 5를 가진 TryCount 를 생성한다.")
    @Test
    void tryCountConvert() {
        int input = 5;
        TryCount tryCount = TryCountConverter.convertTryCount(input);
        assertThat(tryCount.getTryCount()).isEqualTo(5);
    }


}