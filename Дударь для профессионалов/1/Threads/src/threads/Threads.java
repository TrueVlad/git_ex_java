
package threads;

class SomeThread extends Thread{
    public void run(){
    for(int i=0; i<10; i++){
        System.out.println("Number: " + i);
    }
    }
}


public class Threads {

    
    public static void main(String[] args) {
    ///////////////////////////////////////////////////////////////////////////////////////////  обычное последовательное выполнение   
//        SomeThread somethread0 = new SomeThread();            // просто вызываем метод
//        somethread0.run();
//        
//        SomeThread somethread = new SomeThread();
//        somethread.run();

   //////////////////////////////////////////////////////////////////////////////////////////////   поточное выполнение  
        SomeThread somethread1 = new SomeThread();        // одновременно методы с помощь run 
        somethread1.start();
        
        SomeThread somethread2 = new SomeThread();        // одновременно методы с помощь run 
        somethread2.start();
        
   //////////////////////////////////////////////////////////////////////////////////////////////  поточное выполнение с созданием Thread объекта   
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                System.out.println("Numbbbber: " + i);
                }  
                }
            }); 
        
        t1.start();
    }
    
}
