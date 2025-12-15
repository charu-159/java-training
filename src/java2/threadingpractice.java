//good morning  and welcome continusoly on the screen in java
//java using threads
/*package java2;
class Mythread extends Thread {
    public void run() {
        while (true) {
            System.out.println("good morning");
            System.out.println("welcome");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
              System.out.println(e);
            
            }
        }
    }
}
public class threadingpractice {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
    }
}*/            //  2 question demonstrate the get and set priority
                /*package java2;
                
                class Mythread extends Thread {
                    public Mythread(String name) {
                        super(name);
                    }
                
                    public void run() {
                        while (true) {
                            System.out.println("Thread name: " + getName() + ", Priority: " + getPriority());
                            try {
                                Thread.sleep(500); // thoda delay for readability
                            } catch (InterruptedException e) {
                                System.out.println(e);
                            }
                        }
                    }
                }  */
// 3rd question     - how do you get state of a given hread in java
/*package java2;
          class MyThread extends Thread {
              public void run() {
                  try {
                      Thread.sleep(500);
                  } catch (Exception e) {}
              }
          }

          public class threadingpractice {
              public static void main(String[] args) {
                  MyThread t = new MyThread();

                  System.out.println("State before start: " + t.getState());

                  t.start();
                  System.out.println("State after start: " + t.getState());

                  try {
                      Thread.sleep(100);
                  } catch (Exception e) {}

                  System.out.println("State while running: " + t.getState());

                  try {
                      t.join();
                  } catch (Exception e) {}

                  System.out.println("State after finish: " + t.getState());
              }
          }   */


          //4th-how do you get raference to the current thread in java
             package java2;
           class MyThread extends Thread {
               public void run() {
                   Thread t = Thread.currentThread();  // current thread ka reference
                   System.out.println("Current thread: " + t.getName());
                   System.out.println("Priority: " + t.getPriority());
               }
           }

           public class threadingpractice {
               public static void main(String[] args) {
                   MyThread t1 = new MyThread();
                   t1.setName("CharuThread");
                   t1.start();

                   // main thread ka reference
                   Thread mainThread = Thread.currentThread();
                   System.out.println("Main thread: " + mainThread.getName());
               }
           }
























































































