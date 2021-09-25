import java.io.*;

public class TeamInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("./text-team.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int content;


        if (file.exists()) {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            fileInputStream.close();
        } else {
            System.out.println("erreur");
        }

    }
}
