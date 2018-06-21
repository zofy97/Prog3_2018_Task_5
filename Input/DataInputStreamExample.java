package Input;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("textfile4.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF("Hello World!");
        FileInputStream fileInputStream = new FileInputStream("textfile4.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        while(dataInputStream.available() > 0)  {
            String txt = dataInputStream.readUTF();
            System.out.println(txt + " ");
        }
    }
}
