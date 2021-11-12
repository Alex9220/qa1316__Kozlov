package Lesson5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public  class AppData {
    private String[] header;
    private Integer [][] data;



    public String[] getHeader(){
        return header;
    }


    public Integer[][] getData() {
        return data;
    }


public void readFile (String file){
             try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                 ArrayList<Integer[]> lineList = new ArrayList<>();
                 header = (in.readLine().split(";"));
                 String line;
                 while ((line = in.readLine()) != null) {
                     String[] strArr = line.split(";");
                     Integer[] intArr = new Integer[strArr.length];
                     for (int i = 0; i < strArr.length; i++) {
                         intArr[i] = Integer.parseInt(strArr[i]);
                     }
                     lineList.add(intArr);
                 }
                 data = lineList.toArray(new Integer[][]{});
             } catch (IOException e) {
                 e.printStackTrace();
             }
}

    public void writeToCSV(String resultFileName) {
        try { BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName), StandardCharsets.UTF_8));
            StringBuffer inTheLine = new StringBuffer();
            for (int i = 0; i < header.length; i++) {
                inTheLine.append(header[i]);
                inTheLine.append(";");
            }
            out.write(inTheLine.toString());
            out.newLine();

            for (int i = 0; i < data.length; i++) {
                Integer[] rowData = data[i];
                inTheLine.delete(0, inTheLine.length());
                for (int j = 0; j < rowData.length; j++) {
                    inTheLine.append(rowData[j]);
                    inTheLine.append(";");
                }
                out.write(inTheLine.toString());
                out.newLine();
            }

            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}









