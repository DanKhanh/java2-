/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

  public static void menuConsole(){
      System.out.println("=============Menu Console=============");
      System.out.println("1. Hiện tên sinh viên");
      System.out.println("2. Thêm sinh viên mới");
      System.out.println("3. Đặt sinh viên");
      System.out.println("4. Xóa sinh viên");
      System.out.println("5. Thoát");
      System.out.println("--------------------------------------");
      System.out.println("Hãy điền số mà bạn muốn");
      Scanner scanner=new Scanner(System.in);
      int select=scanner.nextInt();
      switch(select){
          case 1:
              System.out.println("Bạn chọn: \"Hiển thị danh sách sinh viên\"");
              break;
          case 2:
              System.out.println("Bạn chọn: \"Thêm sinh viên mới\"");
              break;
          case 3:
              System.out.println("Bạn chọn: \"Đặt sinh viên\"");
              break;
          case 4:
              System.out.println("Bạn chọn: \"Xóa sinh viên\"");
              break;
          case 5:
              System.out.println("");
              break;
          case 6:
              System.out.println("Number Invalid");
              
      }
  }
    
    
    public static void main(String[] args) {
        menuConsole();
        
    }
    
}