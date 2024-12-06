package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Helper {
    public static BufferedReader getReader(String filename) throws IOException {
        return File.newBufferedReader(getFilePath(filename), option);
    }

    public static BufferedWriter getWriter(String filename, StandardOpenOption option) throws IOException {
        return Files.newBufferedWriter(getFilePath(filename), option)
    }

    private static Path getFilePath(String filename) throws FileNotFoundException {
        Path filePath = Paths.get("data", filename);
        if (!Files.eists(filePath)) {
            throw new FileNotFoundException("File not found: " + filename);
        }
        return filePath;
    }
}