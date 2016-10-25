public class CoffeeMachine {
  private String hotOrCold;
  private String size;
  
  public CoffeeMachine (String hotOrCold, String size){
    this.hotOrCold = hotOrCold;
    this.size = size;
    
  }
  
  public String getHotOrCold(){
    if(hotOrCold.equals("cold")){
      System.out.println("Cold Brew");
    }else if(hotOrCold.equals("hot")){
        System.out.println("Hot Brew");
    }
    return hotOrCold;
  }
  public String getSize(){
    if(size.equals("Large")){
      System.out.println("You have selected the Large size");
    }else{
      System.out.println("please select an available size");
    }
    return size;
  }
  
  public void blendTimer(int time){
    if(time ==1){
      System.out.println("Blended for 30 seconds");
    }else if(time==2){
      System.out.println("Blended for 60 seconds");
    }else if(time==3){
      System.out.println("Blended for 90 seconds");
    }else{
      System.out.println("You have not selected a valid option");
    }
  }
  
  public void waterTemp(String temp){
    if(temp.equals("Med")){
      System.out.println("Heated to medium temperature");
    }else if(temp.equals("High")){
      System.out.println("Heated to high temperature");
    }else{
      System.out.println("You have not selected a valid option");
    }
  }
}