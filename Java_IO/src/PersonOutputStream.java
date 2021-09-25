import java.io.*;

public class PersonOutputStream {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Mathias", "https://github.com/tisserandmat");
        File file = new File("./text.txt");

        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[][] data = new byte[][]{person.getName().getBytes() , " ".getBytes(), person.getGithub().getBytes()};

        ;

        for(byte[] b : data ) {
            fileOutputStream.write(b);
        }

        fileOutputStream.close();


    }
}
