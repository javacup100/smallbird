package com.smallbird.backend.platform.testng;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static void createDir(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }else{
            throw new IOException("文件夹已经存在");
        }
    }
}
