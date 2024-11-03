package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Collections;
import java.util.List;

public class LottoNumberGenerator {
    private List<Integer> lottoNumbers;

    public List<Integer> generateNumbers() {
        this.lottoNumbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Collections.sort(lottoNumbers);
        return List.copyOf(lottoNumbers);
    }
}
