import java.util.Scanner;

public class ToDoKick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int a = 0;
        int brum = 0;
        int al = 10;


        System.out.println("$$$$$$$$\\                      $$\\                                               \n" +
                "\\__$$  __|                     $$ |                                              \n" +
                "   $$ | $$$$$$\\           $$$$$$$ | $$$$$$\\         $$$$$$\\   $$$$$$\\   $$$$$$\\  \n" +
                "   $$ |$$  __$$\\ $$$$$$\\ $$  __$$ |$$  __$$\\        \\____$$\\ $$  __$$\\ $$  __$$\\ \n" +
                "   $$ |$$ /  $$ |\\______|$$ /  $$ |$$ /  $$ |       $$$$$$$ |$$ /  $$ |$$ /  $$ |\n" +
                "   $$ |$$ |  $$ |        $$ |  $$ |$$ |  $$ |      $$  __$$ |$$ |  $$ |$$ |  $$ |\n" +
                "   $$ |\\$$$$$$  |        \\$$$$$$$ |\\$$$$$$  |      \\$$$$$$$ |$$$$$$$  |$$$$$$$  |\n" +
                "   \\__| \\______/          \\_______| \\______/        \\_______|$$  ____/ $$  ____/ \n" +
                "                                                             $$ |      $$ |      \n" +
                "                                                             $$ |      $$ |      \n" +
                "                                                             \\__|      \\__|      ");

        int ab = 0;

        while (ab != 2) {
            //for (int ac = 0; ac < al; ac++) {

            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("You can add up to 10 tasks");
            System.out.println("You have " + a + "/10 task positions filled up!");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1) Manage Tasks");
            System.out.println("2) Exit");
            System.out.println("-----------------------------------------------------------------------------------");
            ab = Integer.parseInt(sc.nextLine());
            if (ab == 1) {
                System.out.println("Tasks management");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("1) Create a new task");
                System.out.println("2) Update a task");
                System.out.println("3) Destroy a task");
                System.out.println("4) Display active tasks");
                System.out.println("5) Go back to main menu");


                int bl = Integer.parseInt(sc.nextLine());

           /*int bl = 0;
           bl = sc.nextInt();
           */

                if (bl == 1) {
                    System.out.println("Choose the number of the task:");
                    int poz = Integer.parseInt(sc.nextLine());
                    poz--;
                    System.out.println("Enter the new task:");
                    arr[poz] = sc.nextLine();
                    a++;
                    al++;

                }
                if (bl == 2) {
                    System.out.println("Choose the number of the task you want to update:");
                    int poz = sc.nextInt();
                    poz--;
                    arr[poz] = "";

                }
                if (bl == 3) {
                    System.out.println("Choose the number of the task you want to delete");
                    int poz = Integer.parseInt(sc.nextLine());
                    poz--;
                    arr[poz] = null;
                    a--;

                }

                if (bl == 4) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i + 1 + ". " + arr[i]);
                        al++;
                    }

                }

                if (bl == 5) {

                }


            } else {
                break;
            }
        }
    }
}



