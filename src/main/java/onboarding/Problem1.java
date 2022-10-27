package onboarding;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. 첫번째 페이지 혹은 마지막 페이지가 매개변수로 들어오면 -1을 리턴한다.
 * 2. 포비와 크롱의 각자리 숫자를 구한다.
 * 3. 포비와 크롱의 각자리 숫자를 더하거나 곱하여 큰수를 구한다.
 * 4. 포비와 크롱의 큰 수끼리 비교한다.
 * 5. 포비의 숫자가 크면 1을 리턴한다.
 * 6. 크롱의 숫자가 크면 2를 리턴한다.
 * 7. 무승부면 0을 리턴한다.
 * 8. 예외사항은 -1을 리턴한다.
 */
class Problem1 {

    private static final int FIRST_PAGE = 1;
    private static final int LAST_PAGE = 400;
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        if (validate(pobi) || validate(crong)) {
            return -1;
        }

        List<Integer> pobiEachNumbers = getEachDigitNumber(pobi);
        List<Integer> crongEachNumbers = getEachDigitNumber(crong);

        return answer;
    }

    private static List<Integer> getEachDigitNumber(List<Integer> getEach) {
        int num;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < getEach.size(); i++) {
            num = getEach.get(i);
            while (num > 0) {
                list.add(num % 10);
                num /= 10;
            }
        }

        return list;
    }

    public static boolean validate(List<Integer> checkList) {
        return checkList.contains(FIRST_PAGE) || checkList.contains(LAST_PAGE);
    }
}