public class InfiniteCondition {
    public static void main(String[] args) {
        int num;
        for(num = 1; num<=10; num++) {
            System.out.println("Still running... " + num);
            // Fixed: num is properly initialized and incremented
            
            if(num>=9){
                break;
            }
        }
    }
}
