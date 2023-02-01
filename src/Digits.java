import java.util.ArrayList;
public class Digits {
    private ArrayList<Integer> digitList = new ArrayList<Integer>();

    public Digits(int num) {
        String temp = num + "";
        for (int i = 0; i < temp.length(); i++) {
            digitList.add(Integer.parseInt(temp.substring(i, i+1)));
        }
    }

    public ArrayList getArrayList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        boolean answer = true;
        for (int i = 0; i < digitList.size()-1; i++) {
            if (digitList.get(i) > digitList.get(i+1)) answer = false;
        }
        return answer;
    }
}
