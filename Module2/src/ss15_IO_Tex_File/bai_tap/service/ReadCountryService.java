package ss15_IO_Tex_File.bai_tap.service;

import ss15_IO_Tex_File.bai_tap.model.CountryObj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCountryService {
    public static final String READ_FILE_COUNTRY = "D:\\codegym\\C1021G1nguyenthanhtam\\C1021G1nguyenthanhtam\\Module2\\src\\ss15_IO_Tex_File\\bai_tap\\model\\country.csv";

    public static List<CountryObj> readFile() {
        List<CountryObj> countryList = new ArrayList<>();
        FileReader fileReader;
        {
            try {
                fileReader = new FileReader(READ_FILE_COUNTRY);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                String temp[];
                CountryObj countryObj;
                while ((line = bufferedReader.readLine()) != null) {
                    temp = line.split(",");
                    countryObj=new CountryObj(Integer.parseInt(temp[0]),temp[1],temp[2] );
                    countryList.add(countryObj);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }


}
