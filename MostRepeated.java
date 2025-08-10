

import java.util.HashMap;

public class MostRepeated{
    public static void main(String[] args) {
        HashMap<Character, Integer> s=new HashMap<>();
        String st="Java is a best programming Language";
        for(char ch:st.toCharArray()){
            s.put(ch,s.getOrDefault(ch, 0)+1);
        }
        System.out.println(s);
        
        System.out.println("To find Max repeating Char");
        
        int maxcount=0;
        char repeatingChar = 0;

        for (char ch : s.keySet()) {
            if (s.get(ch) > maxcount) {
                maxcount=s.get(ch);
                repeatingChar=ch;
            }
        }
        System.out.println("Repeating Char \"" + repeatingChar + "\" which counted " + maxcount);

    }
}
