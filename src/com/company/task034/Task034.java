package com.company.task034;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Task034 {
    public static void run(String[] args) {
        if (args.length == 1) {

            URL url = null;

            try {
                url = new URL(args[0]);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return;
            }

            InputStream in = null;
            try {
                in = url.openStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Files.copy(in, Paths.get("file.exe"), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Console parameters were wrong");
        }
    }
}
