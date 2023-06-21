public class Main {
    public static void main(String[] args) {
        int amount = 100;//сумма на счету
        int addAmount = 900;//сумма пополнения
        int totalAmount = amount + addAmount;//итоговая сумма на счету
        int bonus = addAmount / 100;
        System.out.println("Сумма на счету:");
        System.out.println(totalAmount);

        if (addAmount >= 1000) {
            System.out.println("Количество бонусов:");
            System.out.println(bonus);
        } else {
            System.out.println("Количество бонусов:");
            System.out.println("0");
        }
    }


}
