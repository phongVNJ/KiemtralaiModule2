import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String REGEX_EMAIL ="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";


    public RegexEmail(){
        pattern = Pattern.compile(REGEX_EMAIL);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
