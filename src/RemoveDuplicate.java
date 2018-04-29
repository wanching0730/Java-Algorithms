import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,1,3,6,7,7,8,9,10,2));
        int i = 0;

        while(i < array.size()) {
            int temp = array.get(i);
            int j = 0;
            ArrayList<Integer> containsArr = new ArrayList<>();
            while(j < array.size()) {
                if(temp == array.get(j)) {
                    containsArr.add(array.get(j));
                }
                j++;
            }

            if(containsArr.size() > 1) {
                for(int h = 0; h < containsArr.size(); h++)
                    array.remove(containsArr.get(h));
            } else
                i++;
        }

        for(int k = 0; k <  array.size(); k++) {
            System.out.println(array.get(k) + "");
        }

    }
}
