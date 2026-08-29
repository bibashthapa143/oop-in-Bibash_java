import java.io.IOException;

class Testthrow1{
  void m() throws IOException{
    throw new IOException("device error");
  }
  void n() throws IOException{
    m();
  }
  void p(){
    try{
      n();
    }catch(Exception e){
      System.out.println("exception handled");
    }
  }
  public static void main(String args[]){
    Testthrow1 obj = new Testthrow1();
    obj.p();
    System.out.println("normal flow...");
  }
}