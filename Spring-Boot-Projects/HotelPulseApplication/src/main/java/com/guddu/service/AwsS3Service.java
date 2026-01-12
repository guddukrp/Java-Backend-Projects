package com.guddu.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;

@Service
public class AwsS3Service  {

    private static final String UPLOAD_DIR = "uploads";

    public String saveImageToS3(MultipartFile photo) {
        String storedFilePath;

        try {
            String originalFilename = photo.getOriginalFilename();
            if (originalFilename == null) {
                throw new RuntimeException("Invalid file name.");
            }

            // Ensure the "uploads" directory exists in the project root
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                boolean created = uploadDir.mkdirs();
                if (!created) {
                    throw new RuntimeException("Failed to create the uploads directory.");
                }
            }

            // Store the file in the "uploads" directory
            File localFile = new File(uploadDir, originalFilename);
            try (FileOutputStream fos = new FileOutputStream(localFile)) {
                fos.write(photo.getBytes());
            }

            // Return the relative path for easier reference
            storedFilePath = Paths.get(UPLOAD_DIR, originalFilename).toString();
            return storedFilePath;

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to save image to project folder: " + e.getMessage());
        }
    }
}
