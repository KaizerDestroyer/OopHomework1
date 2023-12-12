public class Lesson1Main {

    public static void main(String[] args) {
        int Amount = 0;
        public Account(int money) {
            this.Amount = Amount;
        }

        public int GetAmount() {
            return Amount;
        }

        public int PutAmount(int Replenishment) {
            Amount += Replenishment;
        }

        public int takeAmount(int removal) {
            finalAmount = Amount - removal;
            if (finalAmount != 0)
                Amount = finalAmount;
            else
                System.out.println("Your account is negative");
        }

    }
}