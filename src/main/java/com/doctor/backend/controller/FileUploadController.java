package com.doctor.backend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/upload")
public class FileUploadController {

    private final String uploadDir = "uploads";

    @PostMapping
    public Map<String, String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            throw new RuntimeException("Cannot upload empty file");
        }

        // Create directory if it doesn't exist
        Path root = Paths.get(uploadDir);
        if (!Files.exists(root)) {
            Files.createDirectories(root);
        }

        // Generate a unique filename
        String extension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String filename = UUID.randomUUID().toString() + extension;
        
        // Save the file
        Files.copy(file.getInputStream(), root.resolve(filename));

        // Return the path
        Map<String, String> response = new HashMap<>();
        response.put("url", "uploads/" + filename);
        return response;
    }
}
