public class Main {
    public static void main(String[] args) {
        int amount = 100;//сумма на счету
        int addAmount = 1000;//сумма пополнения
        int bonus = addAmount / 100;
        int totalAmount = amount + addAmount;//итоговая сумма на счету


        if (addAmount >= 1000) {
            System.out.println("Сумма на счету:");
            System.out.println(totalAmount + bonus);
            System.out.println("Количество бонусов:");
            System.out.println(bonus);
        } else {
            System.out.println("Сумма на счету:");
            System.out.println(totalAmount);
            System.out.println("Количество бонусов:");
            System.out.println("0");
        }
    }


}
