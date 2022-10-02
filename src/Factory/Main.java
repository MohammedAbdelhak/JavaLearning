package Factory;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        Os os = new Android();
        os.specs();
        */ 
        //Exposing the Android Constructor to the main class "
        // the client " is not really good...

        //factory Pattern now : ===> 
        OsFactory myFactory = new OsFactory(); // this factory is the one who's gonna create for us the object
        Os os = myFactory.Make4Me("Android");//nothing to show expect for a factory method with a string arg
        os.specs(); 

        Os os2 = myFactory.Make4Me("Ios");
        os2.specs();
    }


}
