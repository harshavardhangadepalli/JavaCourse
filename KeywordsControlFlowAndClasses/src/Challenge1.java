public class Challenge1 {
    public static void main(String[] args) {
        int a = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",a);
        a = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", a);
        a = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", a);
        a = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", a);
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position "+position+" on the highscore table");
    }
    public static int calculateHighScorePosition(int score){
        if(score >= 1000)
            return 1;
        if(score >= 500)
            return 2;
        if(score >= 100)
            return 3;
        return 4;
    }
}
