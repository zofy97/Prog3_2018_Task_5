package Output;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String file = "textfile1.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(dataOutputStream);
        PrintStream printStream = new PrintStream(bufferedOutputStream);
        bufferedOutputStream.write("Hello World".getBytes());
        dataOutputStream.writeInt(65);
        printStream.print(new Date());
        bufferedOutputStream.close();
        dataOutputStream.flush();
        dataOutputStream.close();
        printStream.close();
    }
}
