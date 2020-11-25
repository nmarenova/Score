public class Score {
    public static void main(String[] args) {
        int score = 100;
        int refill = 1300;
        int reward = 0;
        if (refill > 1000) {
            reward = refill / 100;
        }

        score = score + refill + reward;

        System.out.println(reward);
    }
}



