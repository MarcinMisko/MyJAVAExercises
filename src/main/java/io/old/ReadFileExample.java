package io.old;

import java.io.*;
import java.net.URL;

public class ReadFileExample {
    public static void main(String[] args) {
        URL path = ReadFileExample.class.getResource("TextInput.txt");
        File file = new File(path.getPath());
        if(file.exists()) {
            if(file.canRead()) {
                FileInputStream inputStream = null;
                try {
                    inputStream = new FileInputStream(file);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    boolean read = true;
                    StringBuilder sb = new StringBuilder();
                    while(read) {
                        String line = bufferedReader.readLine();
                        if(line == null) {
                            break;
                        }
                        sb.append(line).append("\n");
                    }
                    System.out.println(sb.toString());
                    inputStream.close();  //zamykanie strumienia.Trzeba zamykać strumień bo plik będzie cały czas widniał jako zajęty
                } catch(IOException e) {
                    e.printStackTrace();
                } finally {

                }
            }
        }

    }
}
