package io.Examples;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class FileCreateExample {
    public static void main(String[] args) {

        // URL url = FileCreateExample.class.getResource("Test.txt");
        Path path = Paths.get("Text.txt");
        System.out.println(Files.exists(path));
        if (!Files.exists(path)){
            try {
                Path createdFile = Files.createFile(path);
                Set<StandardOpenOption> options = new HashSet<>();
                options.add(StandardOpenOption.APPEND);  //musimy podać opcję APPEND aby móc pisać w pliku.
                                                         // Java domyślnie uznaje, że nie możemy pisać w pliku
                SeekableByteChannel byteChannel = Files.newByteChannel(path);
                ByteBuffer buffer = ByteBuffer.wrap("This is\n a multiline\n text".getBytes());
                byteChannel.write(buffer);
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
