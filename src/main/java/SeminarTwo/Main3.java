package SeminarTwo;

public class Main3 {
    /*
    Обработайте возможные исключительные ситуации.
    “Битые” значения в исходном массиве считайте нулями.
    Можно внести в код правки, которые считаете необходимыми.
     */

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "23", "0"}, {"sdfsd", "44"}} ;
        System.out.println(ex2(arr));
    }

    public static int ex2(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String item = arr[i][j];
//                if (checkText(item)) {
                if (item.matches("[0-9]+")){
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

    private static boolean checkText(String s){
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
