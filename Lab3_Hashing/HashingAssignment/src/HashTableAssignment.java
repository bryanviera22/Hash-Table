import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HashTableAssignment {

    public HashTableAssignment() throws IOException {

        FileReader fileReader = new FileReader("/Users/bryan/Desktop/google-10000-english-usa.txt");
        BufferedReader buffReader = new BufferedReader(fileReader);

        while(buffReader.ready()){
            System.out.println(hash(buffReader.readLine()));
        }

    }

    //hash converts each string into a number
        public int hash(String s) {

            // TODO: 2/20/22
            int number = 0;
            return number;

        }



    public static void main(String[] args) throws IOException {
            new HashTableAssignment();

    }
}
