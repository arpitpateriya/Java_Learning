public interface streetfoodabstraction {
    void maggi();
    void pacvbaji();
    void noddles();
    void chikenlopipop();
}
class khanaa implements streetfoodabstraction{
     public void maggi(){
         System.out.println("i eat maggi");
     }
    public void pacvbaji(){
         System.out.println("i eat pav");
     }
     public void noddles(){
         System.out.println("i eat noodeels");
     }
      public void chikenlopipop(){
          System.out.println("i eat chicken");
      }

}
class streetfood{
    public static void main (String args[]){
        khanaa k=new khanaa();
        k.chikenlopipop();
        k.maggi();
        k.noddles();
        k.pacvbaji();
    }
}