import java.util.ArrayList;
import java.util.Collections;

public class SCAN {

    ArrayList<Integer> left = new ArrayList<Integer>();
    ArrayList<Integer> right = new ArrayList<Integer>();
    int total = 0;

    public void execute(int head, ArrayList<Integer> requests, String direction)
    {
        int temp=head;

        if (direction == "left")
            left.add(0);
        else if (direction == "right")
            right.add(199);

        for (int i = 0; i < requests.size(); i++) {
            if(head>requests.get(i))
                left.add(requests.get(i));
            else
                right.add(requests.get(i));
        }

        Collections.sort(left);
        Collections.sort(right);

        int run=2;
        while(run>0) {

            if(direction.equalsIgnoreCase("left")) {
                for(int i=0 ; i<left.size();i++){
                    total+=Math.abs(temp - left.get(i));
                    temp = left.get(i);
                }
                direction="right";
            }
            else if(direction.equalsIgnoreCase("right")) {
                for(int i=0 ; i<right.size();i++){
                    total+=Math.abs(temp - right.get(i));
                    temp = right.get(i);
                }
            }
            run--;
        }

        System.out.print("TOTAL: ");
        System.out.println(total);

    }

}

/*
8
176 79 34 60 92 11 41 114
50
left
226
 */