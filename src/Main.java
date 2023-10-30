
public class Main {
   public static void main (String[] args){
       castingPrimitivo();
       cPrimitivo();

   }
   private static void castingPrimitivo(){

       int    n1=10;
       short  n2 = (short) n1;
       System.out.println(n2);

       short n3=122;
       int n4 = n3;
       System.out.println(n4);

       long n5 = 1111111111111111111l;
       int  n6 = (int) n5;
       System.out.println(n6);

       int  n7 = 1111111111;
       long n8 = n7;
       System.out.println(n8);

       double n9 = n5;
       System.out.println(n5);

   }
   //Tipos complexos de Wappers
   private int codigo1;
   private Integer codigo;
   private long codigoMaior = 11111111111l;
   private  Long codigoMaior1=111111111111l;
   private boolean status = true;
   private float ffloat = 11111.0f;
   private Float ffloat1 = 11111.0f;

   public  void teste(){
       //this.ffloat = null;
       this.ffloat1 = null;

   }
    private static void cPrimitivo(){
       //boxing
       Boolean status = true;
       Boolean status1 = Boolean.TRUE;

       Character c= 'A';
       Integer idade = 10;
       Long cpf = Long.valueOf(111111111111l);
       Long cpf1 = 111111111111l;
       //unboxing
        boolean status2 = Boolean.TRUE;
        char letra = Character.valueOf('A');
        int idade2 = Integer.valueOf(12);
    }
}
