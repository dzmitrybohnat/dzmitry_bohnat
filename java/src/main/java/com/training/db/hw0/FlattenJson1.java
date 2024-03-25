package com.training.db.hw0;

import com.github.opendevl.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FlattenJson1 {

    public static void main(String[] args) throws Exception {
        String str = new String(Files.readAllBytes(Paths.get("C:\\Users\\Dzmitry_Bohnat\\IdeaProjects\\response.json")));

        JFlat flatMe = new JFlat(str);

        //get the 2D representation of JSON document
        flatMe.json2Sheet().headerSeparator(".").getJsonAsSheet();

        //write the 2D representation in csv format
        flatMe.write2csv("C:\\Users\\Dzmitry_Bohnat\\IdeaProjects\\response.csv");
    }

}