import java.io.*;

public class PersonInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("./text.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int content ;



        if(file.exists()) {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();

            fileInputStream.close();
        }else {
            System.out.println("erreur");
        }


    }
}
