package ss17_String_Regex.thuc_hanh;

public class Text {
    public static final String[] validEmail=new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com","comma@gmail.com","manakamera@coan.vn.cm"};
    public static final String[] invalidEmail=new String[]{ "@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
    public static void main(String[] args) {
        EmailExample example=new EmailExample();
        for (String email:validEmail){
            boolean check= example.validate(email);
            System.out.println("Email is " + email +" is valid: "+ check);
        }
        for (String email:invalidEmail){
            boolean check= example.validate(email);
            System.out.println("Email is " + email +" is valid: "+ check);
        }
    }
}
