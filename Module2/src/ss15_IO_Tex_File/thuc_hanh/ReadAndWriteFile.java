package ss15_IO_Tex_File.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath)  {
        List<Integer> numbers =new ArrayList<>();
        try {
            File file=new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br =new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("file không tồn tại hoặc nọi dung có lỗi  ");
        }catch (IOException e){
            e.printStackTrace();
        }
        return numbers;
    }
    public void writeFile(String filePath,int max){
        try {

            FileWriter writer=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("giá trị lớn nhất là: "+max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
