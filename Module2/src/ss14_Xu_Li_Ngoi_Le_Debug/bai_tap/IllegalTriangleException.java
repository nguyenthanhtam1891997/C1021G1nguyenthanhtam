package ss14_Xu_Li_Ngoi_Le_Debug.bai_tap;

public class IllegalTriangleException extends Exception{
  String error ;

    public IllegalTriangleException( String error) {
        super();
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
