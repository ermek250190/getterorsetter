package com.company;

public class Lapton {

//    private String noutbuktunaty;
//    private int pamyat;
//    private String color;
//    private String processor;
//
//
//
//    public String getnoutbuktunaty(){
//        return noutbuktunaty;
//
//    }
//    public void setnoutbuktunaty(String noutbuktunaty){
//        this.noutbuktunaty=noutbuktunaty;
//    }
//    public int getpamyat(){
//        return pamyat;
//    }
//    public void setpamyat( int pamyat){
//        this.pamyat=pamyat;
//    }
//    public String getcolor(){
//        return color;
//    }
//    public void setcolor(String color) {
//        this.color=color;
//    }
//    public String getprocessor(){
//        return processor;
//    }
//    public void setProcessor(String processor){
//        this.processor=processor;
//    }
//
//       void getinfolapton(){
//           System.out.println("info about laptop--------------");
//           System.out.println("laptop name"+ getpamyat());
//           System.out.println("memory"+getpamyat());
//           System.out.println("processor"+getprocessor());
//           System.out.println("color"+getcolor());
//       }


    private String noutname;
    private String color;
    private int memory;
    private String processor;

  public String getNoutname(){
      return noutname;
  }
  public void setNoutname(String noutname){
      this.noutname=noutname;
  }
  public String getColor(){
      return color;
  }
  public void setColor(String color){
      this.color=color;
  }
  public int getMemory(){
      return memory;
  }
  public void setMemory(int memory){
      this.memory=memory;
  }
  public String getProcessor(){
      return processor;
  }
  public void setProcessor(String processor){
      this.processor=processor;
  }
  void getinfolapton(){
      System.out.println("lapton name"+getNoutname());
      System.out.println("memory"+getMemory());
      System.out.println("color"+getColor());
      System.out.println("processr"+getProcessor());
  }
}





