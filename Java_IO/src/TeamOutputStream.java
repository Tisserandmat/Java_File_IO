import java.io.*;


public class TeamOutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("./text-team.txt");


        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileOutputStream fileOutputStream = new FileOutputStream(file);

            FileWriter fw = new FileWriter(file);


            byte[][] data = new byte[][]{"mathias ".getBytes(), "zurabi ".getBytes(), "mathieu ".getBytes() ,
                    "arnaud ".getBytes(), "thuy ".getBytes(), "gersey ".getBytes(), "raphaël".getBytes()};

            for (int i = 0; i< data.length ; i++) {

                fileOutputStream.write(data[i]);

            }
            fileOutputStream.close();

            }


        }
    }

