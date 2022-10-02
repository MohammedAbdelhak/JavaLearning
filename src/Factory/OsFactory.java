package Factory;

public class OsFactory {
    public Os Make4Me(String s){
        if(s.equals("Android")){
            return new Android();
        }else{
            if(s.equals("Ios")){
                return new Ios();
            }else {
                return new WindowsOs();
            }
        }
    }
}
