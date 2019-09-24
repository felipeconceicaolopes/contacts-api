package br.com.contact;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {
	public static String readPath(String filePath) {
        ClassLoader classLoader = JsonHelper.class.getClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(filePath)) {
           return IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
	}
	
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}



