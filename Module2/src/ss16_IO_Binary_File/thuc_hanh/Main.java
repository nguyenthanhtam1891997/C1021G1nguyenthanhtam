package ss16_IO_Binary_File.thuc_hanh;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava(File source, File dest){
        try {
            Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void copyFileUsingStream(File source,File dest){
        InputStream is =null;
        OutputStream os=null;
        try {
            is =new FileInputStream(source);
            File file;
            os=new FileOutputStream(dest);
            byte[] buffer=new byte[1024];
            int length;
            while ((length=is.read(buffer))>0){
                os.write(buffer,0,length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                System.out.println("can not copy that file");
            }

        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath=input.nextLine();
        System.out.println("Enter destination file: ");
        String destPath=input.nextLine();

        File sourceFile=new File(sourcePath);
        File destFile=new File(destPath);
        copyFileUsingStream(sourceFile,destFile);
        System.out.println("copy completed");


    }
}
