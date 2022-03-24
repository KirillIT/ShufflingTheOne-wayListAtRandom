package com.company;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class ToFile {

    public void ToFile(simpleList list, String path) {

        File file = new File(path);

        PrintWriter pw = null;

        try {

            pw = new PrintWriter(file);

        }

        catch (FileNotFoundException ex) {

            ex.printStackTrace();

        }

        for (int i = 0; i < list.size(); i++) {

            assert pw != null;

            pw.print(list.get(i) + " ");

        }

        assert pw != null;

        pw.close();

    }
}
