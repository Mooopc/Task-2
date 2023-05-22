public class Main {
    public static void main(String[] args) {
        int initialAccount = 150;
        int deposit = 115_000;
        int bonus = 1;
        int rublesForBonus = 100;
        int totalBonus;
        int finalAccount;

        if (deposit > rublesForBonus) {
            totalBonus = deposit / rublesForBonus * bonus;
        } else {
            totalBonus = 0;
        }
        finalAccount = initialAccount + deposit + totalBonus;
        System.out.printf("Итоговый счет: " + finalAccount + ". Итоговый бонус: " + totalBonus);
    }
}