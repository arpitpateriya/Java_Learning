public interface absatraction {
    void  eat();
    void sleep();

}
interface pet{
    void play();

}
 class dog implements absatraction,pet{
    public void eat(){
        System.out.println("dog is eating");

    }
    public void sleep(){
        System.out.println("dog is sleeping" );
    }
    public void play(){
        System.out.println("dog is playing");
    }
}
class abstraction {
    public static void main(String args[]) {
        dog d = new dog();
        d.eat();
    }
}