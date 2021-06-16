package _8_CleanCode.exercise;

public class TennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        int play1_score = m_score1;
        int play2_score = m_score2;
        if (play1_score == play2_score) {
            switch (play1_score) {
                case LOVE:
                    score = "Love-All";
                    break;
                case FIFTEEN:
                    score = "Fifteen-All";
                    break;
                case THIRTY:
                    score = "Thirty-All";
                    break;
                case FORTY:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (play1_score >= 4 || play2_score >= 4) {
            int minusResult = play1_score - play2_score;
            boolean play1_score_Bigger_play2_score = minusResult == 1;
            if (play1_score_Bigger_play2_score) score = "Advantage player1";
            else {
                boolean play2_score_Bigger_play1_score = minusResult == -1;
                if (play2_score_Bigger_play1_score) score = "Advantage player2";
                else {
                    boolean isPlay1win = minusResult >= 2;
                    if (isPlay1win) score = "Win for player1";
                    else score = "Win for player2";
                }
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = play1_score;
                else {
                    score += "-";
                    tempScore = play2_score;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}