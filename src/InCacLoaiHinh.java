import java.util.Scanner;

public class InCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("Make a choice: ");
        System.out.println("1. Print the rectangle");  //hinh chữ nhật
        System.out.println("2. Print the square triangle");  //tam giác vuông
        System.out.println("3. Print isosceles triangle");  //tam giác cân
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Make a choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle: ");
                    System.out.print("height: ");
                    int height = sc.nextInt();
                    System.out.print("width: ");
                    int width = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            if (j > 1 && j < width && i > 1 && i < height) {
                                System.out.print("   ");
                            } else {
                                System.out.print("*  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle: ");
                    System.out.print("With height");
                    int height1 = sc.nextInt();
                    for (int i = 1; i <= height1; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 1; i <= height1; i++) {
                        for (int j = height1 - i; j >= 0; j--) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 0; i <= height1; i++) {
                        for (int k = 1; k <= i; k++) {
                            System.out.print("   ");
                        }
                        for (int j = height1 - i; j > 0; j--) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= height1; i++) {
                        for (int j = height1 - i; j > 0; j--) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("3. Print isosceles triangle: ");
                    System.out.print("With height: ");
                    int height2 = sc.nextInt();
                    for (int i = 1; i <= height2; i++) {
                        for (int j = height2 - i; j > 0; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        for (int l = 1; l < i; l++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("4. Exit");
                    System.exit(0);
                    break;
                    default:
                        System.out.println("No choise!");
                        System.out.println("Thoát chương trình.");
                        System.exit(0);
            }
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println();
        }
    }
}
