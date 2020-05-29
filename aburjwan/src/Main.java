import java.util.ArrayList;

public class Main {
    static int maxRow = 20;
    public static void main(String[] args) {
        ArrayList<Integer> currList = new ArrayList<Integer>();
        ArrayList<Integer> prevList = new ArrayList<Integer>();
        for (int n = 0; n < maxRow; n++) {
            int val = 0;
            String space = "";
            String rowData = "";
            prevList = (ArrayList<Integer>)currList.clone();
            currList.clear();
            currList.add(0, 1);
            for (int i = 0; i < n; i++) {
                if (i > 0) {
                    val = prevList.get((i-1)) +
                            prevList.get(i);
                } else {
                    val = 1;
                }
                currList.add(i, val);
            }
            for (int m = maxRow - n; m > 1; m--) {
                space += "	";
            }
            for (int k = 0; k < currList.size(); k++) {
                rowData += (currList.get(k) + "		");
            }
            System.out.println("Row#" + (n + 1) + ":	" + space + rowData +"\n");
        }
    }
}