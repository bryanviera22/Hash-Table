import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HashTableAssignment {

    public HashTableAssignment() throws IOException {

        FileReader fileReader = new FileReader("/Users/bryan/Desktop/google-10000-english-usa.txt");
        BufferedReader buffReader = new BufferedReader(fileReader);

        while(buffReader.ready()){
            String currentWord = buffReader.readLine();
            System.out.println(currentWord + " hashes to " + hash(currentWord));

//            System.out.println(hash(buffReader.readLine()));
        }

    }

    //hash converts each string into a number
        public int hash(String s) {

        int num = 0;

        System.out.println(s.length());

            for(int i= 0; i<s.length(); i++){
                num = num + (int)s.charAt(i);

                System.out.println(num);

            }

            return num % 12000;

        }



    public static void main(String[] args) throws IOException {
            new HashTableAssignment();

    }
}
