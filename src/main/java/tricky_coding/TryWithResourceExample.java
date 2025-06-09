package tricky_coding;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) throws  IOException {

        try(FileReader reader = new FileReader("file.txt")) {
            System.out.println(reader.read());
        }


    }

}
