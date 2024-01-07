class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[] nextMonthGifts = new int[friends.length];
        int[] giftIndexs = new int[friends.length];
        int[][] givenRecords = new int[friends.length][friends.length];

        for (String gift : gifts) {
            String[] giftInfo = gift.split(" ");
            String givenFriendName = giftInfo[0];
            int givenFriendNumber = getNumberFromNameList(friends, givenFriendName);
            String receivedFriendName = giftInfo[1];
            int receivedFriendNumber = getNumberFromNameList(friends, receivedFriendName);

            givenRecords[givenFriendNumber][receivedFriendNumber]++;
            giftIndexs[givenFriendNumber]--;
            giftIndexs[receivedFriendNumber]++;
        }

        for (int from = 0; from < friends.length; from++) {
            for (int to = from + 1; to < friends.length; to++) {
                int givenCount = givenRecords[from][to];
                int receivedCount = givenRecords[to][from];
                if (givenCount == receivedCount) {
                    if (giftIndexs[from] == giftIndexs[to]) {
                        continue;
                    }
                    if (giftIndexs[from] > giftIndexs[to]) {
                        nextMonthGifts[to]++;
                    } else {
                        nextMonthGifts[from]++;
                    }
                } else {
                    if (givenCount > receivedCount) {
                        nextMonthGifts[from]++;
                    } else {
                        nextMonthGifts[to]++;
                    }
                }
            }
        }

        for (int nextMonthGift : nextMonthGifts) {
            answer = nextMonthGift > answer ? nextMonthGift : answer;
        }
        return answer;
    }

    public int getNumberFromNameList(String[] nameList, String value) {
        int number = -1;
        if (value == null || value.length() == 0) {
            return number;
        }

        for (int i = 0; i < nameList.length; i++) {
            String name = nameList[i];
            if (value.equals(name)) {
                number = i;
                break;
            }
        }

        return number;
    }
}