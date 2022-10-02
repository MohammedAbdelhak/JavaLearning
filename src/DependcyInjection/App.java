package DependcyInjection;


public class App {
    public static void main(String[] args) throws Exception {

        //Pc myPc = new Pc(new AdataHD());
        //myPc.Hd1.GetName();
        Object j = new App();
            System.out.println(j.getClass().getClassLoader());



    }
}
