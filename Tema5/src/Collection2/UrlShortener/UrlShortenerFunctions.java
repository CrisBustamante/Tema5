package Collection2.UrlShortener;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UrlShortenerFunctions {
    private Map<String, String> urlMap;
    private Random random;

    public UrlShortenerFunctions() {
        urlMap = new HashMap<>();
        random = new Random();
    }

    public void createNewRecord(String url) {
        String shortKey = generateRandomKey();
        urlMap.put(shortKey, url);
        System.out.println("SHORTENED URL CREATED: " + shortKey);
    }

    public void resolveURL(String shortKey) {
        String url = urlMap.get(shortKey);
        if (url != null) {
            System.out.println("ORIGINAL URL: " + url);
        } else {
            System.out.println("URL NOT FOUND FOR THE GIVEN KEY.");
        }
    }

    public void deleteRecord(String shortKey) {
        if (urlMap.containsKey(shortKey)) {
            urlMap.remove(shortKey);
            System.out.println("RECORD DELETED SUCCESSFULLY.");
        } else {
            System.out.println("URL NOT FOUND FOR THE GIVEN KEY.");
        }
    }

    public void showAllRecords() {
        System.out.println("ALL RECORDS:");
        for (Map.Entry<String, String> entry : urlMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    private String generateRandomKey() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }
        return sb.toString();
    }
}