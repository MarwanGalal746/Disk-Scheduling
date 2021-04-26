import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of cylinders I/O requests: ");
        int number = input.nextInt();

        System.out.print("Enter the number of requests: ");
        ArrayList<Integer> requests = new ArrayList<Integer>();

        for (int i=0 ; i<number ; i++){
            int x = input.nextInt();
            requests.add(x);
        }

        System.out.print("Enter Initial head start cylinder: ");
        int head = input.nextInt();

        System.out.println("1- FCFS");
        System.out.println("2- SSTF");
        System.out.println("3- SCAN");
        System.out.println("4- C-SCAN");
        System.out.println("5- LOOK");
        System.out.println("6- C-LOOK");

        int choice = input.nextInt();
        if(choice==1)
        {
            FCFS fcfs=new FCFS();
            fcfs.exec(head,requests);
        }
        if(choice==2)
        {
            SSTF sstf = new SSTF();
            sstf.exec(head,requests);
        }
        if(choice==3)
        {
            input.nextLine();
            System.out.print("Enter direction: ");
            String direction = input.nextLine();
            SCAN scan = new SCAN();
            scan.execute(head,requests,direction);
        }
        if(choice==4)
        {

        }
        if(choice==5)
        {

        }
        if(choice==6)
        {

        }
    }
}
