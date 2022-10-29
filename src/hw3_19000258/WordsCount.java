// Ex5

package hw3_19000258;

import java.util.*;

public class WordsCount {

    public static void main(String[] args) {
         
//    	String lyric = "That Arizona sky burnin' in your eyes "
//         		      + "You look at me and, babe, I wanna catch on fire "
//        		      + "It's buried in my soul like California gold "
//        		      + "You found the light in me that I couldn't find "
//        		      + "So when I'm all choked up "
//        		      + "But I can't find the words. "
//        		      + "Every time we say goodbye. "
//        		      + "Baby, it hurts. "
//        		      + "When the sun goes down. "
//        		      + "And the band won't play. "
//        		      + "I'll always remember us this way. ";
    	
    	String lyric = "Lovers in the night "
   		      + "Poets tryin' to write "
  		      + "We don't know how to rhyme "
  		      + "But damn we try "
  		      + "But all I really know "
  		      + "But I can't find the words. "
  		      + "You're where I wanna go "
  		      + "The part of me that's you will never die ";
  	
         String[] words = lyric.split(" ");
         
         Map<String, Integer> map = new HashMap<String, Integer>();
         for (int i = 0; i < words.length; i++ ) {
             if (map.containsKey(words[i])) {
                 int value = map.get(words[i]);
                 map.put(words[i], value + 1);
              } 
              else {
            	  map.put(words[i], 1);
              }
         }
    
         Iterator iter = map.entrySet().iterator();
        
         while (iter.hasNext()) {
             Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iter.next();
             System.out.println(" " + entry.getKey() + ": " + entry.getValue());
             System.out.println();
         }
    }
}
