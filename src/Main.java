import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);


    public static void exec(int number, ArrayList<Integer> requests, int head){
        System.out.println("1- FCFS");
        System.out.println("2- SSTF");
        System.out.println("3- SCAN");
        System.out.println("4- C-SCAN");
        System.out.println("5- LOOK");
        System.out.println("6- C-LOOK");
        System.out.println("7- Summary");

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
            CSCAN cscan = new CSCAN();
            cscan.execute(head,requests);
        }
        if(choice==5)
        {
            Look look = new Look();
            look.seekTime(requests,head);
        }
        if(choice==6)
        {
            CLook cLook = new CLook();
            cLook.seekTime(requests,head);
        }
        if(choice==7){
            System.out.println(" Disk scheduling is done by operating systems to schedule IO requests arriving for the disk, this project simulates some disk scheduling algorithms.\n" +
                    "\n" +
                    "The algorithms which simulated in this project:");
            System.out.println("1- FCFS: It is the simplest of all the Disk Scheduling Algorithms. In FCFS, the requests are addressed in the order they arrive in the disk queue.\n" +
                    "\n");
            System.out.println("2- SSTF: (Shortest Seek Time First): It requests having shortest seek time are executed first.\n" +
                    "\n");
            System.out.println("3- SCAN: In SCAN disk scheduling algorithm, head starts from one end of the disk and moves towards the other end, servicing requests in between one by one and reach the other end. Then the direction of the head is reversed and the process continues as head continuously scan back and forth to access the disk.\n" +
                    "\n");
            System.out.println("4- C-SCAN: Circular SCAN (C-SCAN) scheduling algorithm is a modified version of SCAN disk scheduling algorithm that deals with the inefficiency of SCAN algorithm by servicing the requests more uniformly.\n" +
                    "\n");
            System.out.println("5- LOOK: It is advanced version of SCAN disk scheduling with a better seek time, it is like SCAN algorithm but it also looks ahead for more requests to be serviced in the same direction, if there are no pending requests in the the head then we reverse direction and start servicing requests in the opposite direction.\n" +
                    "\n");
            System.out.println("6- C-LOOK: C-LOOK is an enhanced version of both SCAN as well as LOOK disk scheduling algorithms. This algorithm also uses the idea of wrapping the tracks as a circular cylinder as C-SCAN algorithm but the seek time is better than C-SCAN algorithm. We know that C-SCAN is used to avoid starvation and services all the requests more uniformly, the same goes for C-LOOK.\n" +
                    "\n");
        }
    }

    public static void main(String[] args) {
        int number=0;

        ArrayList<Integer> requests = new ArrayList<Integer>();

        int head=0;

        String again = "yes";
        String againData = "yes";

        while(again.equals("yes") || againData.equals("yes")) {
            if(againData.equals("yes")){
                System.out.print("Enter number of cylinders I/O requests: ");
                number = input.nextInt();
                System.out.print("Enter the number of requests: ");

                for (int i=0 ; i<number ; i++){
                    int x = input.nextInt();
                    requests.add(x);
                }

                System.out.print("Enter Initial head start cylinder: ");
                head = input.nextInt();
            }
            exec(number,requests,head);
            System.out.println("Do you want to apply another algorithm with the " +
                    "same data or get the summary of the algorithms?");
            again=input.nextLine();
            again=input.nextLine();
            System.out.println("Do you want to apply another algorithm with another data?");
            againData=input.nextLine();
        }




    }
}
