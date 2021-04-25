import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of cylinders I/O requests: ");
        int n = in.nextInt();
        System.out.print("Enter the number of requests: ");
        ArrayList<Integer> requests = new ArrayList<Integer>();
        for (int i=0 ; i<n ; i++){
            int x = in.nextInt();
            requests.add(x);
        }
        System.out.print("Enter Initial head start cylinder: ");
        int head = in.nextInt();
        FCFS obj = new FCFS();
        obj.exec(head, requests);
        /*SSTF obj = new SSTF();
        obj.exec(head, requests);*/
        /*System.out.println("Enter the number of the algorithm which algorithm you want to apply?");
        System.out.println("1- FCFS");
        System.out.println("2- SSTF");
        System.out.println("3- SCAN");
        System.out.println("4- C-SCAN");
        System.out.println("5- LOOK");
        System.out.println("6- C-LOOK");
        int choice = in.nextInt();
        if(choice==1) //fcfs
            algo = new SSTF();
         else if(choice == 2) {
            algo = new SSTF();

        }
        algo.exec(head,requests);*/
    }
}
