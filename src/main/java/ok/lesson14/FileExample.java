package lesson14;

import java.io.*;


public class FileExample {

    public static void main(String[] args) throws IOException {

        final String PATH = "C:/Users/admin/IdeaProjects/Hillel Java OK/src/main.java.files3/";
        final String NEWPATH = "C:/Users/admin/Desktop/newFiles/";
        String str = "";

        File file = null;

        for (int i = 0; i < 15; i++) {
        file = new File(PATH + "Test" + i + ".txt");
            System.out.println(file.createNewFile());
            System.out.println(file.getName());
            System.out.println(file.toString());
            System.out.println(file.canExecute());
            System.out.println(file.canWrite());
            System.out.println(file.delete());
            System.out.println(file.createNewFile());
            System.out.println(file.getParent());
        }

        File folder = new File(PATH);

        File [] files = folder.listFiles();

        for (File everyFile: files) {
            System.out.println(everyFile);
        }


        File inputFile = new File(PATH + "Song.txt");
        inputFile.createNewFile();

        System.out.println(inputFile.length());

            if (inputFile.exists() && inputFile.length() > 0) {

                FileInputStream fileInputStream = new FileInputStream(inputFile);

                fileInputStream.read();
                System.out.println(fileInputStream.available());

           byte[] bytes = new byte[(int)inputFile.length()];

            int x = fileInputStream.read(bytes);

            char symbol;

            for (byte b : bytes) {
                symbol = (char) b;
                System.out.print(symbol);
                str += symbol;
            }

            System.out.println();

            System.out.println(str);

            System.out.println(x);

            fileInputStream.close();
        }

            boolean toWrite = false;
            boolean toModify = false;

            FileOutputStream fileOutputStream = null;

            ObjectOutputStream objectOutputStream = null;

            for (File everyFile : files) {

                if (everyFile.length() == 0){
                    toWrite = true;
                }else {
                    toModify = true;
                }

                if (toWrite) {
                    fileOutputStream = new FileOutputStream(everyFile);
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(str);
                    objectOutputStream.close();
                    fileOutputStream.close();
                }
                if (toModify) {

                    fileOutputStream = new FileOutputStream(everyFile, true);
                    objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject("THE BEATLES");
                    objectOutputStream.close();
                    fileOutputStream.close();
                }
        }



    }
}
