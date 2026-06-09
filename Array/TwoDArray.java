import java.util.*;

public class TwoDArray {
     public static void main(String[] args) {
     int[][] arr  = new int[5][6];

     //set
     arr[1][3] = 10;
      
     //get
      System.out.println(arr[1][3]);
      System.out.println(arr[2][5]);  //predfined value is 0
     
      //RowCount
      System.out.println(arr.length);  

      //ColumnCount
     System.out.println(arr[0].length);
      
     //Traversal
     for(int i=0;i<arr.length;i++){        //i -> row no.
          for(int j = 0;j<arr[0].length;j++){  //j-> coln no.
             //Process like print or add
             System.out.print(arr[i][j]+" ");
          }
          System.out.println(); // move to next row
     }
     }
     }

