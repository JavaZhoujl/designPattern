package com.zhoujl.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description 视频剪辑示例
 * @Author zjl
 * @Date 2021/4/16 10:05
 * @Version 1.0
 **/
public class FfmpegDemo {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\zhoujianlei\\Desktop\\test.mp4");
        getPartVideoForWindows(file, "");
    }

    /**
     * 视频剪辑
     * @param file 源文件
     * @param outFilePath 输出文件路径
     * @return
     * @throws Exception
     */
    public static String getPartVideoForWindows(File file , String outFilePath){
        //获取输出视频绝对地址
        String filePaths = "D:/BaiduNetdiskDownload/";
        //生成输出视频文件格式，也可以用源文件的格式
        String fileName = System.currentTimeMillis() + ".mp4";
        //完整的输出视频绝对路径
        String fileFinalPath = filePaths + fileName;
        // 创建一个List集合来保存转换视频文件为flv格式的命令
        List<String> convert = new ArrayList<String>();
        // 添加转换工具路径
        convert.add("D:/BaiduNetdiskDownload/ffmpeg.exe");
        //截取开始时间
        convert.add("-ss");
        convert.add("00:00:00.0");
        // 添加参数＂-i＂，该参数指定要转换的文件
        convert.add("-i");
        // 添加要转换格式的视频文件的路径
        convert.add(file.getAbsolutePath());
        //结束时间(截取30秒)
        convert.add("-t");
        convert.add("30");
        //操作方式
        convert.add("-c");
        convert.add("copy");
        convert.add(fileFinalPath);
        // 添加参数＂-y＂，该参数指定将覆盖已存在的文件
        convert.add("-y");

        ProcessBuilder builder = new ProcessBuilder();
        try {
            builder.command(convert);
            builder.start();
            return outFilePath+fileName;
        } catch (Exception e) {
            System.out.println(e);
            return null ;
        }
    }
}
