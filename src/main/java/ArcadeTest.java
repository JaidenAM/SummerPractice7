public class ArcadeTest {
    public static void main(String[] args){
        Cards card1 = new Cards(1234);
        Cards2 card2 = new Cards2(1200);

        card1.playGame();
        card2.playGame();
        card2.requestPrize();
        card2.transfer(card1);
    }
}

