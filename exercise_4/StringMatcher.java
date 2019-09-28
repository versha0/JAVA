import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class StringMatcher {
    public String matching(String inputString,String givenString){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr the string");
        String inputString=sc.nextLine();
        System.out.println("enetr the pattern to be matched");
        String giveString=sc.nextLine();
        StringMatcher sm= new StringMatcher();
        String an= sm.matching(inputString, giveString);
        System.out.println(an);
    }
}