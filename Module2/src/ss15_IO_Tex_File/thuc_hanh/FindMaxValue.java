package ss15_IO_Tex_File.thuc_hanh;

import java.io.IOException;
import java.util.List;

public class FindMaxValue {

    public static final String FILE_NAME = "D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss15_IO_Tex_File\\thuc_hanh\\fileNumber.txt";
    public static final String FILE_WRITE="D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss15_IO_Tex_File\\thuc_hanh\\fileNumberWrite.txt";
    public static int fineMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile= new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(FILE_NAME);
        int maxvalue=fineMax(numbers);
        readAndWriteFile.writeFile(FILE_WRITE,maxvalue);
    }
}
