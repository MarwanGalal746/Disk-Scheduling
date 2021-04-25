import java.util.ArrayList;

public class SSTF {
    private void calcDiff(int head, ArrayList<ArrayList<Integer>> reqDiff){
        for(int i=0 ; i<reqDiff.size();i++){
            reqDiff.get(i).set(0,Math.abs(head - reqDiff.get(i).get(1)));
        }
    }
    public void exec(int head, ArrayList<Integer> requests){
        ArrayList<ArrayList<Integer>>reqDiff = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        int tot=0;
        for(int i=0 ; i<requests.size();i++){
            ArrayList<Integer>temp = new ArrayList<Integer>();
            temp.add(0);
            temp.add(requests.get(i));
            reqDiff.add(temp);
        }
        while(reqDiff.size()>0){
            calcDiff(head,reqDiff);
            int Min = Integer.MAX_VALUE;
            int ind=0;
            for(int i=0 ; i<reqDiff.size();i++){
                if(reqDiff.get(i).get(0) < Min) {
                    Min = reqDiff.get(i).get(0);
                    ind = i;
                }
            }
            res.add(head);
            tot+=reqDiff.get(ind).get(0);
            head=reqDiff.get(ind).get(1);
            reqDiff.remove(ind);
            if(reqDiff.size() == 0)
                res.add(head);
        }
        System.out.print("sequence of head movement: ");
        for(int i=0 ; i<res.size();i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
        System.out.print("total head movement: ");
        System.out.println(tot);
    }
}

/*8
98 183 37 122 14 124 65 67
53
correct output: 53 65 67 37 14 98 122 124 183
                236*/
/*8
176 79 34 60 92 11 41 114
50
correct output: 50 41 34 11 60 79 92 114 176
                24*/