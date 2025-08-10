

import java.util.HashMap;

public class toPrintUnique{
    public static void main(String[] args) {
        HashMap<Character, Integer> s=new HashMap<>();
        String st="Java is a best programming Language";
        for(char ch:st.toCharArray()){
            s.put(ch,s.getOrDefault(ch, 0)+1);
        }
        System.out.println(s);
        
        System.out.print("Unique characters: ");
        for (char ch : s.keySet()) {
            if (s.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }

    }
}