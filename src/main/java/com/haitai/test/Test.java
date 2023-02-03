package com.haitai.test;

import com.haitai.util.HtmlToPdfUtils;

import java.io.*;


public class Test {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        //       html文件所在相对路径
//        String htmlFile = "src/main/resources/html/index2.html";
////        //       pdf文件存储相对路径
////        String pdfFile = "src/main/resources/x6.pdf";

        String htmlFile = "D:\\work_space\\practice\\java_se\\trans_pdf\\src\\main\\java\\com\\haitai\\tg.html";
        String pdfFile = "D:\\work_space\\practice\\java_se\\trans_pdf\\src\\main\\java\\com\\haitai\\testoone2.pdf";

        //        自定义水印
        String waterMarkText =  "";
        InputStream inputStream = new FileInputStream(htmlFile);
        OutputStream outputStream = new FileOutputStream(pdfFile);
        //微软雅黑在windows系统里的位置如下，linux系统直接拷贝该文件放在linux目录下即可
        //        String fontPath = "src/main/resources/font/STHeiti Light.ttc,0";
        String fontPath = "C:\\Windows\\Fonts\\simsun.ttc,0";
        HtmlToPdfUtils.convertToPdf(inputStream, waterMarkText, fontPath, outputStream);
        System.out.println("转换结束，耗时：{}ms"+(System.currentTimeMillis()-startTime));

        System.out.println("修改111");
        System.out.println("hot-fix修改");
    }

    public void say(){
        System.out.println("hot-fix");
    }
}
