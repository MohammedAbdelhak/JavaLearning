package SingleTone;

public class Main {
    public static void main(String[] args) throws InterruptedException {

     /*    Thread t1 = new Thread(new Runnable() {
            public void run (){
                   SingleTone o1 = SingleTone.instance;
                   o1.i = o1.i + 1;
                   System.out.println(o1.i);
           }
       });
       
       Thread t2 = new Thread(new Runnable() {
           public void run (){
               SingleTone o1 = SingleTone.instance;
               o1.i = o1.i + 1;
               System.out.println(o1.i);

          }
      });
      */ //for testing threads on SingleTone Enum class and it works !!!!

      
        Thread t1 = new Thread(new Runnable() {
             public void run (){
                    SingleToneLazy.getInstanceDoubleChecked();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            public void run (){
                  SingleToneLazy.getInstanceDoubleChecked();
           }
       });

        t1.start();
        t2.start();
        
        
        /*   SingleTone obj1 = SingleTone.instance;
            SingleToneEager obj2 = SingleToneEager.getInstance();
            SingleToneEager obj3 = SingleToneEager.getInstance();
            obj1.i = 69;
            System.out.println(obj3.i);
            obj3.i = 99;
            System.out.println(obj2.i);
 */
    }
}
