import java.util.Scanner;

class Shop {

    public class Furniture {
        public static void main(String[] args) {
            int cost;
            int chairCost = 100;
            int sofaCost = 50;
            int tableCost = 70;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите пожалуйста число , под которым находится нужный вам товар");
            int number = scanner.nextInt();
            System.out.println(
                    """
                            1.Диван
                            2.Стул
                            3.Стол
                            """);
            int choice = scanner.nextInt();
            for (int i = 0; i <= choice; i++) {
                System.out.println(i);
            }
            if (choice == 1) {
                System.out.println("Стоимость дивана равна" + sofaCost);
            } else if (choice == 2) {
                System.out.println("Стоимость стула равна" + +chairCost);
            } else if (choice == 3) {
                System.out.println("Стоимость стола равна" + tableCost);
            } else if (choice >= 4) {
                System.out.println("error");

            }
        }

    }
}
