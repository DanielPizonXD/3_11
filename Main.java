class Main {
  public static void main(String[] args) {
  int dlugosc=10;
    for(int y=0;y<10;y++){
      
      for(int x=0;x<19;x++){
        if(x==y+9 || x==9-y ){
          System.out.print("*");
        }
        else
        System.out.print(".");
      }
      System.out.println(".");
      
    }
  }
}