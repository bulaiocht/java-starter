package lesson14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BufferedReaderAndWriterExample {

    public static void main(String[] args) throws IOException {

               final String FILES_PATH = "C:/Users/admin/Desktop/TEST";
               final String FILE_CSV_NAME = "Files.csv";

                File[] files = new File(FILES_PATH).listFiles();

                File fileCSV = new File(FILES_PATH + "/" + FILE_CSV_NAME);

                try(BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(fileCSV, true)))
                {
                    for(File file : files) {
                        if (file.getName().endsWith(".srt")) {

                            System.out.println(file.getName());

                            if( file.length() < 10 )
                            {
                                file.delete();
                                System.out.println (file.getName() + " deleted");
                            }

                            bufferedWriter.write("TEST/" + file.getName().replace(".srt", "") + ","
                                    + file.getName().replace(".srt", ""));
                            bufferedWriter.newLine();

                        }
                    }
                    bufferedWriter.flush();
                }


        System.out.println("------------------------------------------------------------------");

             srtHoursDuration(FILES_PATH);
            }


             public static void srtHoursDuration(String filePath) throws IOException{

                 Pattern pattern
                         = Pattern.compile("\\d\\d:\\d\\d:\\d\\d,\\d\\d\\d");

                 Pattern pattern2 = Pattern.compile(":\\d\\d,\\d\\d\\d");

                String line;

                String formatTimeLine;

                String [] hourMin;

                Float hour;

                Float mins;

                Float minsInHours;

                Float srtHours;

                Float hoursSum = 0.0f;

                File[] files = new File(filePath).listFiles();

                for (File item : files) {

                    if (item.getName().endsWith(".srt")) {

                        try (RandomAccessFile reader = new RandomAccessFile(item, "r")) {

                            for (int k = 0; k <= reader.length(); k++) {

                                reader.seek(reader.length() - k);

                                line = reader.readLine();

                                if (line != null && pattern.matcher(line).matches()) {

                                    formatTimeLine = pattern2.matcher(line).replaceAll("");
                                    hourMin = formatTimeLine.split(":");
                                    hour = Float.parseFloat(hourMin[0]);
                                    mins = Float.parseFloat(hourMin[1]);
                                    minsInHours = mins / 60;
                                    srtHours = hour + minsInHours;
                                    System.out.println(item.getName() + ": ");
                                    System.out.print("    ");
                                    System.out.println(srtHours + " hours");
                                    hoursSum += srtHours;
                                    break;
                                }
                            }
                        }
                    }
                }
                System.out.println("Total hours: " + hoursSum);
            }


















/*
                public static void
            firstSrtHoursDuration(String filePath) throws FileNotFoundException, IOException {

                    Pattern pattern
                            = Pattern.compile("\\d\\d:\\d\\d:\\d\\d,\\d\\d\\d --> \\d\\d:\\d\\d:\\d\\d,\\d\\d\\d");

                    Pattern pattern2
                            = Pattern.compile("\\d\\d:\\d\\d:\\d\\d,\\d\\d\\d -->");

                    Pattern pattern3 = Pattern.compile(":\\d\\d,\\d\\d\\d");

                    String line = null;

                    String formatTimeLine;

                    String formatNewTimeLine;

                    String[] hourMin;

                    Float hour = 0.0f;

                    Float mins = 0.0f;

                    Float minsInHours = 0.0f;

                    Float srtHours = 0.0f;

                    Float hoursSum = 0.0f;

                    ArrayList<String> arrayList = null;

                    File[] main.java.files = new File(filePath).listFiles();
                    for (File item : main.java.files) {
                        if (item.getName().endsWith(".srt")) {
                            try (BufferedReader bufferedReader =
                                         new BufferedReader(new FileReader(item.getPath()))) {

                                String lines;
                                while ((lines = bufferedReader.readLine()) != null) {
                                    if (pattern.matcher(lines).matches()) {
                                        arrayList = new ArrayList();
                                        arrayList.add(lines);
                                    }
                                }
                                if (pattern.matcher(arrayList.get(arrayList.size() - 1)).matches()) {
                                    formatTimeLine = arrayList.get(arrayList.size() - 1);
                                    formatNewTimeLine = pattern2.matcher(formatTimeLine).replaceAll("");
                                    hourMin = formatNewTimeLine.split(":");
                                    hour = Float.parseFloat(hourMin[0]);
                                    mins = Float.parseFloat(hourMin[1]);
                                    minsInHours = mins / 60;
                                    srtHours = hour + minsInHours;
                                    System.out.println(item.getName() + ": ");
                                    System.out.print("    ");
                                    System.out.println(srtHours + " hours");
                                    hoursSum += srtHours;

                                }
                            }

                            System.out.println("Total hours: " + hoursSum);
                        }
                    }
                }*/
}



