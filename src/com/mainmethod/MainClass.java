package com.mainmethod;

import com.util.FastDfsUtil;
import org.csource.common.MyException;
import org.csource.fastdfs.FileInfo;

import java.io.*;

/**
 * @author yu.wenhua
 * @desc
 * @date 2020/1/15 19:12
 */
public class MainClass {
    public static void main(String[] args) {
        FastDfsUtil fastDfsUtil = new FastDfsUtil();
        String url = "E:/ywh.txt";
        File f = new File(url);
        try {
//            InputStream inputStream = new FileInputStream(f);
//            String path = fastDfsUtil.fdfsUpload(inputStream,"ywh.txt");
//            System.out.println(path);
            String savePth = "/group1/M00/00/00/wKgAh14fzxOAHvjIAAAADBp6drY275.txt";
            FileInfo fileInfo = FastDfsUtil.fdfdFileInfo(savePth);
//            System.out.println(fileInfo);
//            FastDfsUtil.fdfsDownload(savePth,"D:/");
//            FastDfsUtil.fdfsDeleteFile(savePth);
// FastDfsUtil.fdfsDownload()
            byte[] result = FastDfsUtil.fdfsDownload(savePth);
            String local_filename = "d:/build.txt";
            fastDfsUtil.writeByteToFile(result, local_filename);
            File file = new File(local_filename);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
