package Module1.OOPS.nestedclasses;
abstract class Sample {
    abstract void start();
    public  final int SPEED_TIME=30;
}
interface Preview{
    void stop();
    void start();
}
/*abstract class implementation using Anonymous class   */
public class Anonymous {
    static void main() {


        Sample s1 = new Sample() {
            @Override
            public void start() {
                System.out.println("Please press the Start Button");
                System.out.println("speed time is " + SPEED_TIME + "seconds to reach 500 Km");
            }
        };
        /* Interface implementation using Anonymous class  */
        Preview preview = new Preview() {
            @Override
            public void stop() {
                System.out.println("Apply break");
            }

            @Override
            public void start() {
                System.out.println("Please press the Start Button");

            }
        };
        s1.start();
        preview.start();
        preview.stop();
    }
}