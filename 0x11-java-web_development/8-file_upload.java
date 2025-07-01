// File: 8-file_upload.java
// Description: Handling file uploads in servlets

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.nio.file.*;

/**
 * UploadServlet handles file upload requests
 */
public class UploadServlet extends HttpServlet {
    private final String UPLOAD_DIR = "uploads";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Part filePart = request.getPart("file");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

        String applicationPath = request.getServletContext().getRealPath("");
        Path uploadPath = Paths.get(applicationPath, UPLOAD_DIR);

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        try (InputStream fileContent = filePart.getInputStream()) {
            Files.copy(fileContent, uploadPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
            response.getWriter().println("File uploaded: " + fileName);
        } catch (IOException | ServletException e) {
            response.getWriter().println("Upload failed: " + e.getMessage());
        }
    }
}
