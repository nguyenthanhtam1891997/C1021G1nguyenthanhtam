package bai_Tap_Them.bai1.model;

public class Candidate {
    private int Coded ;
    private String Name;
    private String DayOfBirth;
    private int ScoreMath;
    private int ScoreLiterature;
    private int ScoreEnglish;

    public Candidate() {
    }

    public Candidate(int coded, String name, String dayOfBirth, int scoreMath, int scoreLiterature, int scoreEnglish) {
        Coded = coded;
        Name = name;
        DayOfBirth = dayOfBirth;
        ScoreMath = scoreMath;
        ScoreLiterature = scoreLiterature;
        ScoreEnglish = scoreEnglish;
    }

    public int getCoded() {
        return Coded;
    }

    public void setCoded(int coded) {
        Coded = coded;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDayOfBirth() {
        return DayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        DayOfBirth = dayOfBirth;
    }

    public int getScoreMath() {
        return ScoreMath;
    }

    public void setScoreMath(int scoreMath) {
        ScoreMath = scoreMath;
    }

    public int getScoreLiterature() {
        return ScoreLiterature;
    }

    public void setScoreLiterature(int scoreLiterature) {
        ScoreLiterature = scoreLiterature;
    }

    public int getScoreEnglish() {
        return ScoreEnglish;
    }

    public void setScoreEnglish(int scoreEnglish) {
        ScoreEnglish = scoreEnglish;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "Coded=" + Coded +
                ", Name='" + Name + '\'' +
                ", DayOfBirth='" + DayOfBirth + '\'' +
                ", ScoreMath=" + ScoreMath +
                ", ScoreLiterature=" + ScoreLiterature +
                ", ScoreEnglish=" + ScoreEnglish +
                '}';
    }
}
