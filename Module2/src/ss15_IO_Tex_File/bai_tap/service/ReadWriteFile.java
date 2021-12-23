package ss15_IO_Tex_File.bai_tap.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

    public static final String INPUT_TXT = "D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss15_IO_Tex_File\\bai_tap\\model\\inputfile.txt";
    public static final String OUTPUT_TXT = "D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss15_IO_Tex_File\\bai_tap\\model\\outputfile.txt";

    public static String readFile() {
        String result="";
        int text;
        FileReader fileReader=null;
        try {
             fileReader=new FileReader(INPUT_TXT);
             while ((text= fileReader.read())!=-1){
                 result += (char) text;//chưa đặt char
             }
             fileReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            try {
//                fileReader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
        return result;
    }
    public static void writeFile(String str){
        try {
            FileWriter fileWriter=new FileWriter(OUTPUT_TXT);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        String input=readFile();
//        System.out.println(input);
//        writeFile(input);
//    }
}
