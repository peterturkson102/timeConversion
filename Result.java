import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String hh = s.charAt(0)+""+s.charAt(1);
    String format = s.charAt(8)+""+s.charAt(9);
    
    /**************************************
    Tip: use .equals for comparing strings instead of ==
    **********************************/
    
    if(format.equals("PM")  && !hh.equals("12") ){
     int hhT= Integer.parseInt(hh)+12; 
     hh = String.valueOf(hhT); 
    }else if(format.equals("AM")  && hh.equals("12")){
        hh="00";
    }
    
    return hh+":"+s.charAt(3)+""+s.charAt(4)+":"+s.charAt(6)+""+s.charAt(7);
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
