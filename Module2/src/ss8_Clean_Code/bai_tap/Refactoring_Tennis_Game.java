package ss8_Clean_Code.bai_tap;

public class Refactoring_Tennis_Game {

    public static String getScore(String player1Name, String player2Name, int playerScore1, int playerScore2) {
        String callPoint = "";
        boolean isDeuce = playerScore1 == playerScore2;
        boolean isAdvantage = playerScore1 >= 4 || playerScore2 >= 4;
        if (isDeuce) {
            switch (playerScore1) {
                case 0:
                    callPoint = "Love-All";
                    break;
                case 1:
                    callPoint = "Fifteen-All";
                    break;
                case 2:
                    callPoint = "Thirty-All";
                    break;
                case 3:
                    callPoint = "Forty-All";
                    break;
                default:
                    callPoint = "Deuce";
                    break;

            }
        } else {
            if (isAdvantage) {
                int differencePoint = playerScore1 - playerScore2;
                callPoint = findWinner(differencePoint);
            } else {
                callPoint = sowResults(playerScore1, playerScore2, callPoint);
            }
        }
        return callPoint;
    }

    private static String sowResults(int playerScore1, int playerScore2, String callPoint) {
        int tempScore;
        int player;
        final int ZERO_POINT = 0;
        final int FIFTEEN_POINT = 1;
        final int THIRTY_POINT = 2;
        final int FORTY_POINT = 3;
        for (player = 1; player < 3; player++) {
            boolean isPlayer1 = player == 1;
            if (isPlayer1) {
                tempScore = playerScore1;
            } else {
                callPoint += "-";
                tempScore = playerScore2;
            }
            switch (tempScore) {
                case ZERO_POINT:
                    callPoint += "Love";
                    break;
                case FIFTEEN_POINT:
                    callPoint += "Fifteen";
                    break;
                case THIRTY_POINT:
                    callPoint += "Thirty";
                    break;
                case FORTY_POINT:
                    callPoint += "Forty";
                    break;
            }
        }
        return callPoint;
    }

    private static String findWinner(int differencePoint) {
        String callPoint;
        if (differencePoint == 1) {
            callPoint = "Advantage player1";
        } else if (differencePoint == -1) {
            callPoint = "Advantage player2";
        } else if (differencePoint >= 2) {
            callPoint = "Win for player1";
        } else callPoint = "Win for player2";
        return callPoint;
    }
}
