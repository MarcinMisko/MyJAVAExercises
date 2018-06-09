package io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileExample {

    public static void main(String[] args) {

        URL url = ReadFileExample.class.getResource("TextInputNio.txt");
        Path path = Paths.get(url.getPath());

        readStringSimple(path);
        readStringFromReader(path);
        readStringFromByteChannel(path);
    }

    //simple
    public static void readStringSimple(Path path) {
        try {
            List<String> contents = Files.readAllLines(path);
            contents.stream().forEach(x -> System.out.println(x));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //proper :)
    public static void readStringFromReader(Path path) {

        Charset charset = Charset.forName("UTF8");  // UTF8 system kodowania Unicode, wykorzystujący od 1 do 6 bajtów do zakodowania pojedynczego znaku
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path, charset);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //uber proper :):)
    public static void readStringFromByteChannel(Path path) {
        try {
            SeekableByteChannel byteChannel = Files.newByteChannel(path);
            ByteBuffer byteBuffer = ByteBuffer.allocate(10);

            Charset charset = Charset.forName("UTF8");
            while (byteChannel.read(byteBuffer) > 0) {
                byteBuffer.rewind();
                System.out.print(charset.decode(byteBuffer));
                byteBuffer.flip();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


}
