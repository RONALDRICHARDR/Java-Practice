public class Recursion{
   int rec(int num){
    if(num==1){
        return 1;
    }
    return num * rec(num-1);
   }
   public static void main(String[] args) {
      Recursion recursion = new Recursion();
       int num=4;
       int result = recursion.rec(num);
       System.out.println("Factorial of " + result);

   }
   }