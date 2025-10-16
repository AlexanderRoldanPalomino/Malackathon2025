package web;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class WebUtils {

    /**
     * Loads a file from the classpath (inside the JAR) and returns its content as a String.
     *
     * @param path Path to the resource (e.g. "/pages/index.html")
     * @return Contents of the file as a String
     * @throws IOException if the resource cannot be found or read
     */
    public static String loadResourceAsString(String path) throws IOException {
        if (!path.startsWith("/")) {
            path = "/" + path; // Ensure leading slash for getResourceAsStream
        }

        try (InputStream inputStream = WebUtils.class.getResourceAsStream(path)) {
            if (inputStream == null) {
                throw new IOException("Resource not found: " + path);
            }

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
                return reader.lines().collect(Collectors.joining("\n"));
            }
        }
    }
}