package ss15_IO_Tex_File.bai_tap.controler;

import ss15_IO_Tex_File.bai_tap.service.ReadWriteFile;

public class TextCoPyFile {
    public static void main(String[] args) {
//      ReadWriteFile readWriteFile=new ReadWriteFile();
//        readWriteFile.readFile()
        String input=ReadWriteFile.readFile();
        System.out.println(input);
        ReadWriteFile.writeFile(input);

    }
}
