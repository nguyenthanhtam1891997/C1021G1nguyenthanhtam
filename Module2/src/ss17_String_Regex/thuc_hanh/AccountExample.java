package ss17_String_Regex.thuc_hanh;

public class AccountExample {
    public static final String ACCOUNT="[_a-z0-9]{6,}";
    public static final String[] validAccount=new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh"};
    public static final String[] invalidAccount=new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        for (String email:validAccount){
            System.out.println(email.matches(ACCOUNT));
        }
        System.out.println("/*/*/*/*/*/*/*/");
        for (String email:invalidAccount){
            System.out.println(email.matches(ACCOUNT));
        }
    }
}
