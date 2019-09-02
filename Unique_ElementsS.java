/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assignments_01;

/**
 *
 * @author SathurjanV
 */
public class Unique_ElementsS{

  static int[] array={9,2,1,4,5,2,1,9,3,4};
  static int[] checkarray = new int[10];
  static int length=array.length;
  static int checkarray_length=checkarray.length;

  public static void main(String[] args) {

    int count;
    int checkarray_count=0;

    System.out.println(" unique values"+"\t\t\t"+"times of occurrence");

    for (int i=0;i<length ;i++ ){
      count=1;
        if(!is_exist(array[i])){
          for (int j=i+1;j<length ;j++) {
            if (array[i]==array[j]) {
              count++;
            }
          }
          checkarray[checkarray_count]=array[i];
          checkarray_count++;

          System.out.println("\t"+array[i]+"\t\t\t\t"+count);
        }


    }




  }

  public static boolean is_exist(int element){
    for (int i=0;i<checkarray_length ;i++ ) {
      if (element==checkarray[i]) {
        return true;
      }
    }
    return false;
  }
}

