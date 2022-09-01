public class Cards2 {
    //Fields
    private int credits;
    private int tickets;

    //Constructor
    public Cards2(int credits) {
        this.credits = credits;

    }

    //Methods
    public void requestPrize() {
        if (tickets >= 100){
            System.out.println("You received a bear");
        }else {
            System.out.println("Get more tickets Loser");
        }
    }

    public void playGame() {
        int com = (int) (Math.random() * 3);

        System.out.println("Paper (0), Rock (1), or Scizzors (2)?");
        int hum = (int) (Math.random() * 3);
        System.out.println("Your number is " + hum);
        System.out.println("The computers number is " + com);

        if (com == (hum))
            System.out.println("It's a tie!");

        else if (hum == 0) {
            if (com == 1) {
                tickets += 50;
                System.out.println("Your tickets are "+tickets);
                System.out.println("You chose paper, computer chose rock You Win!");
            } else if (com == 2)
                System.out.println("You chose paper, Computer chose scissors You Lose!");
        } else if (hum == 1) {
            if (com == 2) {
                tickets += 50;
                System.out.println("Your tickets are "+tickets);
                System.out.println("You chose Rock, computer chose scissors You Win!");
            } else if (com == 0)
                System.out.println("You chose Rock, Computer chose paper You Lose!");
            else if (hum == 2) {
                if (com == 0) {
                    tickets += 50;
                    System.out.println("Your tickets are "+tickets);
                    System.out.println("You chose Scissors, computer chose paper You Win!");
                } else if (com == 1) {
                    System.out.println("You chose Scissors, Computer chose rock You Lose!");
                }
            }
        }
    }
    public void transfer (Cards cards) {
        credits = cards.getCredits() + this.credits;
        tickets = cards.getTickets() + this.tickets;
        System.out.println("tickets = "+ tickets + " " + "credits = "+ credits );
    }

    //Getters
    public int getCredits() {
        return credits;
    }

    public int getTickets() {
        return tickets;
    }
    //Setters
    public void setTickets ( int tickets){
        this.tickets = tickets;
    }
}
