package ss15_IO_Tex_File.thuc_hanh;


import java.io.*;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;
            while ((line = br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }

            br.close();
            System.out.println("Tổng = "+sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẩn file: ");
        Scanner input=new Scanner(System.in);
        String path = input.nextLine();
        ReadFileExample readFile =new ReadFileExample();
        readFile.readFileText(path);
    }

}
