public class WrongPasswordException extends Exception {
    private String desc;

    public WrongPasswordException(){
        super();
    }

    public WrongPasswordException(String desc){
        super(desc);
        this.desc=desc;
    }




}
