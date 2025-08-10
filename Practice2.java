

import java.util.HashMap;

public class Practice2{
    public static void main(String[] args) {
        HashMap<Character, Integer> s=new HashMap<>();
        String st="Java is a best programming Language";
        for(char ch:st.toCharArray()){
            s.put(ch,s.getOrDefault(ch, 0)+1);
        }
        System.out.println(s);
        System.out.println((int)(Math.random()*(56-2))+1);

    }
}