package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgmentTest {
    @Test
    fun `심판은 자동차의 위치가 가장 많은 우승자들을 판별할 수 있다`() {
        // given
        val judgment = Judgment()
        val car1 = Car("aaa", 1)
        val car2 = Car("bbb", 2)

        // when
        val winners = judgment.judgeWinners(listOf(car1, car2))

        // then
        assertThat(winners).containsExactly(car2)
    }
}
