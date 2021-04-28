import java.util.ArrayList;
import java.util.Collections;

public class CSCAN {

    //array to store left sectors
    ArrayList<Integer> left = new ArrayList<Integer>();
    //array to store right sectors
    ArrayList<Integer> right = new ArrayList<Integer>();

    // total seek time
    int totalSeek = 0;

    public void execute(int head, ArrayList<Integer> requests)
    {
        // start position of the head
        int temp = head;

        // add last sector will be visited in each direction
        // first sector index
        left.add(0);
        // last sector index 'size of hard disk'
        right.add(199);


        // assign each sector index inappropriate array
        for (int i = 0; i < requests.size(); i++) {
            if(head > requests.get(i)) {
                left.add(requests.get(i));
            }else {
                right.add(requests.get(i));
            }
        }

        Collections.sort(left);
        Collections.sort(right);


        int accessedPosition;
        int seek;
        for (int i = 0; i < right.size(); i++) {
            accessedPosition = right.get(i);
            seek = Math.abs(accessedPosition - head);

            // Increase the total seek
            totalSeek += seek;

            // make head = last Accessed track
            head = accessedPosition;
        }

        // jump to the start
        head = 0;

        totalSeek += (199);

        // Now service the requests again
        for (int i = 0; i < left.size(); i++) {
            accessedPosition = left.get(i);
            seek = Math.abs(accessedPosition - head);

            // Increase the total seek
            totalSeek += seek;

            // make head = last Accessed track
            head = accessedPosition;
        }

        System.out.print("TOTAL: ");
        System.out.println(totalSeek);

    }

}

/*
8
176
79
34
6092
11
41
114
50
*/