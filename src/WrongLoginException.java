public class WrongLoginException extends Exception{
    private  String desc;

    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String desc){
        super(desc);
        this.desc=desc;
    }




}
