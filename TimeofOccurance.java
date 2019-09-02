/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgic_assignments;

/**
 *
 * @author SathurjanV
 */
public class TimeofOccurance{
  public static void main(String[] args) {

    int[] array={1,2,2,3,4,5,5,6,6,7};

    int length=array.length;
    int count=1;
    int i=0;

    System.out.println(" unique values"+"\t\t\t"+"times of occurrence");

    for(i=0;i<length-1;i++) {
      if(array[i]==array[i+1]){
        count++;

      }
      else{
        System.out.println("\t"+array[i]+"\t\t\t\t"+count);
        count=1;
      }

    }

    System.out.println("\t"+array[i]+"\t\t\t\t"+count);

    }
}
