package ua.epam.qa.lesson08;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class ProgramMap {
    public static void main(String[] args) throws IOException {
       //String str = "mama mila ramu ramu mila mama rima mama";
      // BufferedReader br = new BufferedReader(new FileReader("textlog.txt"));
        //https://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code
        Map<String, List<String>> freqURLMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            String url =" https://www.stihi-rus.ru/World/Shekspir/"+i+".htm";
            System.out.println(url);
            String str = getStringFromUrl(url);
           // Map<String, Integer> freqMap = getMapFreqWordFromString(str);
            getMapFreqWordFromURLString(freqURLMap,str,url);
            for (String key : freqURLMap.keySet()) {
                System.out.println(key +" : "+freqURLMap.get(key));
            }
           // System.out.println(freqMap);
          //  System.out.println(freqMap.keySet());
        }

    }

    private static void printFreqWord() throws IOException {
        Map<String, List<String>> freqURLMap = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            String url =" https://www.stihi-rus.ru/World/Shekspir/"+i+".htm";
            System.out.println(url);
            String str = getStringFromUrl(url);
            Map<String, Integer> freqMap = getMapFreqWordFromString(str);
            for (String key : freqMap.keySet()) {
                System.out.println(key +" : "+freqMap.get(key));
            }
            // System.out.println(freqMap);
            //  System.out.println(freqMap.keySet());
    }}
    private static void getMapFreqWordFromURLString(Map<String, List<String>> freqUrlMap, String str, String url) {
        String [] words = str.split("\\s");
        for (String word: words) {
            if (!freqUrlMap.containsKey(word))
                freqUrlMap.put(word,new ArrayList<>());
            freqUrlMap.get(word).add(url);
        }

    }
    private static Map<String, Integer> getMapFreqWordFromString(String str) {
        String [] words = str.split("\\s");
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word: words) {
            if (!freqMap.containsKey(word))
                freqMap.put(word,1);
            else freqMap.put(word, freqMap.get(word)+1);
        }
        return freqMap;
    }


    private static String getStringFromUrl(String url) throws IOException {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()));

        StringBuilder sb = new StringBuilder();
        while(br.ready())
            sb.append(br.readLine());
        return sb.toString();
    }


    private static void setExample() {
        Set<Integer> shop1 = new HashSet<>();
        shop1.add(1);
        shop1.add(2);
        shop1.add(1);
        shop1.add(3);

        Set<Integer> shop2 = new HashSet<>();
        shop2.add(10);
        shop2.add(2);
        shop2.add(2);
        shop2.add(3);

        System.out.println(shop1);
        System.out.println(shop2);
        System.out.println(shop1.containsAll(shop2));

        // System.out.println(shop1.retainAll(shop2));
        // System.out.println(shop1);
        // System.out.println(shop1.removeAll(shop2));
        // System.out.println(shop1);
        System.out.println(shop1.addAll(shop2));
        System.out.println(shop1);
    }
}
