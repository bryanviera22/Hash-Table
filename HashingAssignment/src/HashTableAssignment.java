import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class HashTableAssignment {

    int collisions = 0;

    String [] table = new String[12000];

    public HashTableAssignment() throws IOException {

        FileReader fileReader = new FileReader("/Users/bryan/Desktop/google-10000-english-usa.txt");
        BufferedReader buffReader = new BufferedReader(fileReader);

        while(buffReader.ready()){
            String currentWord = buffReader.readLine();
           // System.out.println(currentWord + " hashes to " + hash(currentWord));

            store(currentWord);

//            System.out.println(hash(buffReader.readLine()));
        }

    }

    //hash converts each string into a number
    public int hash(String word) {

        int num = 0;

        //System.out.println(s.length());

            for(int i= 0; i<word.length(); i++){
                num = num * (int)word.charAt(i);
            }

          //  System.out.println(num%12000);

            return num;
        }

        //Store String in Index
    public void store(String word) throws IOException {

            if (table[hash(word)] == null) {
                table[hash(word)] = word;
            } else {
                collisions++;
                int index = hash(word);
                int i = index;
                while(i < table.length){
                    if(table[i] == null){
                        table[i] = word;
                    }
                    else{
                        i++;
                        collisions++;
                    }
                }
            }

        System.out.println(collisions);

//            System.out.println(hash(word));
//            System.out.println(word);
        

    }





    public static void main(String[] args) throws IOException {
            new HashTableAssignment();

    }
}
