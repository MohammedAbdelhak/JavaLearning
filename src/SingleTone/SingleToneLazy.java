package SingleTone;

public class SingleToneLazy {

    static SingleToneLazy obj;
    int i = 55;

    private SingleToneLazy() {
            System.out.println("created object");
    }

    public static SingleToneLazy getInstance() {
        if (obj == null) {
            obj = new SingleToneLazy();
        }
        return obj;
    } // for single threaded app

    static public synchronized SingleToneLazy getInstanceSyncronized() {
        if (obj == null) {
            obj = new SingleToneLazy();
        }
        return obj;
    }// for multiple threaded app , Complexity is high so performance is low 

    static public SingleToneLazy getInstanceDoubleChecked() {
        if (obj == null) {
            synchronized (SingleToneLazy.class) {
                if (obj == null) {
                    obj = new SingleToneLazy();
                }
            }
        }
        return obj;
    }// for multiple threaded app , Complexity is super low in comparaison with the previous one , so performance is high!
}
