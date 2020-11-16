package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    
    private String fileName;
    private Map<String, String> dictionary;
    
    public SaveableDictionary() {
        dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        fileName = file;
    }
    
    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }
    
    public String translate(String word) {
        return dictionary.getOrDefault(word, null);
    }
    
    public void delete(String word) {
        String translation = dictionary.get(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }
    
    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean save() {
        List<String> usedWords = new ArrayList<>();
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String key: this.dictionary.keySet()) {
                String translatedWord = dictionary.get(key);
                usedWords.add(translatedWord);
                if (!(usedWords.contains(key))) {
                    writer.write(key + ":" + this.dictionary.get(key) + "\n");     
              } 
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }   
    }
    
}
