package com.example.demo.Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author:jobs
 * @date:2018/11/30 13:36
 * @description:
 */
public class FileUtil {
    public static void fileupload(byte[] file,String filePath,String fileName) throws IOException {
        //目标目录
        File targetfile = new File(filePath);
        if(targetfile.exists()) {
            targetfile.mkdirs();
        }

        //二进制流写入
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}
