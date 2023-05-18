public class Main {
    public static void main(String[] args) {
        int initial_account = 150;
        int deposit = 115_000;
        int bonus = 1;
        int rubles_for_bonus = 100;
        int total_bonus;
        int final_account;

        if (deposit > rubles_for_bonus) {
            total_bonus = deposit / rubles_for_bonus * bonus;
        } else {
            total_bonus = 0;
        }
        final_account = initial_account + deposit + total_bonus;
        System.out.printf("Итоговый счет: " + final_account +
                ". Итоговый бонус: " + total_bonus);
    }
}