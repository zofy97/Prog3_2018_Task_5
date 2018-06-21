package Input;

import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args)  {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        DataInputStream dataInputStream = null;

        try {
            fileInputStream = new FileInputStream("textfile4.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            dataInputStream = new DataInputStream(bufferedInputStream);

            while(dataInputStream.available() != 0) {
                System.out.println(dataInputStream.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                bufferedInputStream.close();
                dataInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
