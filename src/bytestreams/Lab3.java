package bytestreams;

import java.io.*;

public class Lab3 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.writeInt(30);
            output.writeDouble(65.5);
            output.writeChar('A');
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
            input.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
