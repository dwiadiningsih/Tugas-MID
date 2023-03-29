/* Nama : Dwi Adiningsih
   Nim : 13020210021 */

interface A { public void aaa(); }
interface B extends A {
}

class Central0021 implements B {
   public void aaa() {
      System.out.println("aaa");
   }
   
   public static void main(String arg[]) {
      Central0021 obj = new Central0021();
      System.out.println("main");
      obj.aaa();
   }
}