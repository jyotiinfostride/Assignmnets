
package CollectionDemo;

import java.util.ArrayList;

public class Assignment1 {
    //	void collectData() throws IOException {

        public static void main(String args[]) {
            ArrayList<String> Collectiona1 = new ArrayList<>();
            String word = null;
//		Collectiona1.add(word);
            Collectiona1.add("Stupid");
            Collectiona1.add("NonSense");


//		System.out.println(Collectiona1);
            String s1 = "Hello Stupid";
            for(String e : Collectiona1) {
                s1=s1.replace(e, "$$$$$");
            }
            System.out.println(s1);

        }

    }


