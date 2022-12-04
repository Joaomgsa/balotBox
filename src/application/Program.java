package application;

import entities.VoteCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path:");
        String filePath = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            Map<String,Integer> map = new LinkedHashMap<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String candidate = fields[0];
                int count = Integer.parseInt(fields[1]);
                if (map.containsKey(candidate)){
                    int votesSoFar = map.get(candidate);
                    map.put(candidate,count + votesSoFar);
                }else{
                    map.put(candidate,count);
                }
                line = br.readLine();
            }
            for (String key: map.keySet()){
                System.out.println(key +": "+ map.get(key));            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage() );
        }
        sc.close();
    }
}