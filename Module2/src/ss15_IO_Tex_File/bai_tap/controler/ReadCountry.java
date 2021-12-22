package ss15_IO_Tex_File.bai_tap.controler;

import ss15_IO_Tex_File.bai_tap.model.CountryObj;
import ss15_IO_Tex_File.bai_tap.service.ReadCountryService;


import java.util.List;

public class ReadCountry {
    public static void main(String[] args) {
        List<CountryObj> countryList= ReadCountryService.readFile();
        for (CountryObj countryObj:countryList){
            System.out.println(countryObj.getName());
        }
    }
}
