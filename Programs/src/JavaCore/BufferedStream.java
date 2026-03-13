package JavaCore;

import java.io.*;

public class BufferedStream {

    public static void main(String[] args) {

        try (BufferedReader buffInput = new BufferedReader(new FileReader(args[0]));
             BufferedWriter buffOutput = new BufferedWriter(new FileWriter(args[1]))) {

            String line = "";

            while ((line = buffInput.readLine()) != null) {
                buffOutput.write(line);
                buffOutput.newLine();
            }

        } 
        catch (FileNotFoundException f) {
            System.out.println("File Not Found " + f);
        } 
        catch (IOException e) {
            System.out.println("Exception " + e);
        }
    }
}