package agolorithm;


import java.util.ArrayList;
import java.util.List;

public class DuplicatesNum {
    public List showDuplicates(Integer [] input){
        List output = new ArrayList<>();
        int[] label = new int[input.length+1];
        for (int i=0;i<input.length;i++){
            int value = input[i];
            label[value]++;
            if(label[value]>1){
                output.add(value);
            }
        }
        return output;
    }

    public static void main (String[] arg){
        Integer [] S={4,3,2,7,8,2,3,1};
        Integer [] S2={4,3,2,7,8,2,3,1,1,5};
        DuplicatesNum solution = new DuplicatesNum();
        System.out.println(solution.showDuplicates(S));
        System.out.println(solution.showDuplicates(S2));

    }

}
