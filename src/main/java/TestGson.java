package main.java;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestGson {

    public static void main(String arg[]) throws IOException {
        Gson gson= new Gson();
        Object obj= new Object(1,"abc","gr2",5);
        String s= gson.toJson(obj);
        String filePath= "D:\\"+obj.getGroup()+"\\";
        new File(filePath).mkdir();
        String fileName=filePath+obj.getName()+".json";
        FileWriter fw= new FileWriter(fileName);
        fw.append(s);
        fw.close();
    }
}
