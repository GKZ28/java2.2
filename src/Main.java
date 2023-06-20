public class Main {
    public static void main(String[] args) {
        int x = 100;//сумма на счету
        int y = 1100;//сумма пополнения
        int x1 = x + y;//итоговая сумма на счету
        int b = y / 100;
        System.out.println("Сумма на счету:");
        System.out.println(x1);

        if (y >= 1000) {
            System.out.println("Количество бонусов:");
            System.out.println(b);
        } else {
            System.out.println("Количество бонусов:");
            System.out.println("0");
        }
    }


}
