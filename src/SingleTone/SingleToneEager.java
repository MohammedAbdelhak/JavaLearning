package SingleTone;

public class SingleToneEager {
    static SingleToneEager objEager = new SingleToneEager();
    int i = 6;
    private SingleToneEager(){

    }
    public static SingleToneEager getInstance(){
        return objEager;
    }


}
