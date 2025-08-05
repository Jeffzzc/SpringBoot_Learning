package com.example.springlearning.controller;

import jakarta.servlet.http.HttpServletMapping;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class FileUploadController {
    @PostMapping("/upload")
    public String up(String nickname, MultipartFile photo, HttpServletRequest request) throws Exception{
        System.out.println(nickname);
        // 获取图片原始名称
        System.out.println(photo.getOriginalFilename());

        System.out.println(photo.getContentType());

        String path = request.getServletContext().getRealPath( "/upload/");
        System.out.println(path);
        saveFile(photo, path);
        return"上传成功";
    }

    public void  saveFile(MultipartFile photo, String path) throws Exception{
        File dir = new File(path);
        if(!dir.exists()){
            dir.mkdirs();
        }
    }
}
