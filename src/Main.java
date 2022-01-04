public class Main {
    public static void main(String[] args) {
        int ticketPrice = 6200;
        int rubForOneBonusMile = 20;

        int bonusMiles;
        bonusMiles = ticketPrice / rubForOneBonusMile;

        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
