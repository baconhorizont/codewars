package codewars.kyu6.WriteNumberinExpandedForm;

public class WriteNumberinExpandedForm {
    public static String expandedForm(int num) {
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        while (num != 0){
            int lastNum = num % 10;
            num = num / 10;
            if (lastNum != 0){
            sb.insert(0,lastNum + "0".repeat(counter));
            }
            if (num != 0 && lastNum != 0){
            sb.insert(0," + ");
            }
            counter++;
        }
       return sb.toString();
    }

}
