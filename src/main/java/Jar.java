import java.util.Random;
// Represents the jar that holds the items the player needs to guess
public class Jar {
  
  Random random = new Random();
  private String name;
  private final int MAX_NUM; 
  private int currentItems;

  // Constructor 
  public Jar(String name, int MAX_NUM){
    this.name = name;
    this.MAX_NUM = MAX_NUM;
    
  }
  
  // Getters
  
  public String getName(){
    return name; 
  }
  
  public int getMaxNum(){
    return MAX_NUM; 
  }
  
  public int getCurrentItems(){
   return currentItems; 
  }

  // Method to fill the jar with a random number of items
  public void fill(){
   currentItems = random.nextInt(MAX_NUM)+1; 
  }
  
  
  
}