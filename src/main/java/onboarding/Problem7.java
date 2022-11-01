package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        List<String> userFriendList = userFriends(user, friends);
        friendAndFriends(userFriendList, friends);
        return answer;
    }

    private static void friendAndFriends(List<String> userFriendList, List<List<String>> friends) {
        for (int i = 0; i < userFriendList.size(); i++) {
        }
    }

    private static List<String> userFriends(String user, List<List<String>> friends) {
        List<String> userFriendList = new ArrayList<>();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).contains(user)) {
                userFriendList.add(friends.get(i).get(0));
            }
        }
        return userFriendList;
    }
}
